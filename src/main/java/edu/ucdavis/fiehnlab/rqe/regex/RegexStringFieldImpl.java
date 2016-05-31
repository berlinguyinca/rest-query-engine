package edu.ucdavis.fiehnlab.rqe.regex;

import com.github.rutledgepaulv.qbuilders.builders.QBuilder;
import com.github.rutledgepaulv.qbuilders.conditions.Condition;
import com.github.rutledgepaulv.qbuilders.delegates.virtual.ListablePropertyDelegate;
import com.github.rutledgepaulv.qbuilders.operators.ComparisonOperator;
import com.github.rutledgepaulv.qbuilders.structures.FieldPath;

import java.util.Collections;

/**
 * Created by wohlgemuth on 5/31/16.
 */
public class RegexStringFieldImpl<T extends QBuilder<T>> extends ListablePropertyDelegate<T, String> implements RegexStringField<T> {

    public static final ComparisonOperator REGEX = new ComparisonOperator("REGEX");

    protected RegexStringFieldImpl(FieldPath field, T canonical) {
        super(field, canonical);
    }

    public final Condition<T> lexicallyAfter(String value) {
        return this.condition(this.getField(), ComparisonOperator.GT, Collections.singletonList(value));
    }

    public final Condition<T> lexicallyBefore(String value) {
        return this.condition(this.getField(), ComparisonOperator.LT, Collections.singletonList(value));
    }

    public final Condition<T> lexicallyNotAfter(String value) {
        return this.condition(this.getField(), ComparisonOperator.LTE, Collections.singletonList(value));
    }

    public final Condition<T> lexicallyNotBefore(String value) {
        return this.condition(this.getField(), ComparisonOperator.GTE, Collections.singletonList(value));
    }

    @Override
    public final Condition<T> regex(String pattern) {
        return condition(getField(), REGEX, Collections.singletonList(pattern));
    }

}
