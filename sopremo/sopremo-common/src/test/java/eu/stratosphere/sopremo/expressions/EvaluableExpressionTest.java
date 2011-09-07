package eu.stratosphere.sopremo.expressions;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import eu.stratosphere.sopremo.EvaluationContext;
import eu.stratosphere.sopremo.SopremoTest;

@Ignore
public abstract class EvaluableExpressionTest<T extends EvaluationExpression> extends SopremoTest<T> {
	protected EvaluationContext context;

	@Before
	public void initContext() {
		context = new EvaluationContext();
	}

	@Test
	public void testToString() {
		final StringBuilder builder = new StringBuilder();
		this.first.toString(builder);
		Assert.assertNotSame(
			"builder did not write anything - override this test if it is indeed the desired behavior", "", builder
				.toString().intern());
	}
}
