package io.smartcat.ranger.core.arithmetic;

import io.smartcat.ranger.core.Value;

/**
 * Subtracts two values and returns result as {@code Integer} type.
 */
public class SubtractionValueInteger extends Value<Integer> {

    @SuppressWarnings("rawtypes")
    private final Value minuend;

    @SuppressWarnings("rawtypes")
    private final Value subtrahend;

    /**
     * Creates Subtraction value with specified <code>minuend</code> and <code>subtrahend</code>.
     *
     * @param minuend Value which will be used as minuend for this subtraction.
     * @param subtrahend Value which will be used as subtrahend for this subtraction.
     */
    @SuppressWarnings("rawtypes")
    public SubtractionValueInteger(Value minuend, Value subtrahend) {
        this.minuend = minuend;
        this.subtrahend = subtrahend;
    }

    @Override
    public void reset() {
        super.reset();
        minuend.reset();
        subtrahend.reset();
    }

    @Override
    protected void eval() {
        val = ((Number) minuend.get()).intValue() - ((Number) subtrahend.get()).intValue();
    }
}
