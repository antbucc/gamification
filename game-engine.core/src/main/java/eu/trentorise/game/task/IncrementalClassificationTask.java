package eu.trentorise.game.task;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.trentorise.game.core.TaskSchedule;
import eu.trentorise.game.model.PlayerState;
import eu.trentorise.game.model.PointConcept;
import eu.trentorise.game.model.PointConcept.Period;
import eu.trentorise.game.model.core.GameConcept;

public class IncrementalClassificationTask extends ClassificationTask {

	private final Logger logger = LoggerFactory
			.getLogger(IncrementalClassificationTask.class);

	private String pointConceptName;
	private String periodName;

	public IncrementalClassificationTask(PointConcept pc, String periodName,
			String classificationName) {
		super();
		if (pc != null) {
			Period period = pc.getPeriod(periodName);
			pointConceptName = pc.getName();
			this.periodName = periodName;
			Date startPeriodic = period.getStart();
			long periodLength = period.getPeriod();
			TaskSchedule schedule = new TaskSchedule();
			schedule.setStart(startPeriodic);
			schedule.setPeriod(periodLength);
			super.setClassificationName(classificationName);
			super.setName(classificationName);
			super.setSchedule(schedule);
		}
	}

	public IncrementalClassificationTask() {
		super();
	}

	@Override
	protected double retrieveScore(PlayerState state) {
		for (GameConcept gc : state.getState()) {
			if (gc.getName().equals(pointConceptName)
					&& gc instanceof PointConcept) {
				PointConcept pc = (PointConcept) gc;
				return pc.getPeriodCurrentScore(periodName);
			}
		}
		logger.warn(String
				.format("PointConcept %s not found", pointConceptName));
		return 0d;
	}

	@Override
	protected String getScoreType() {
		return pointConceptName;
	}

}
