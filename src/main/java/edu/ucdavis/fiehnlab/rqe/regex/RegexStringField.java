package edu.ucdavis.fiehnlab.rqe.regex;

import com.github.rutledgepaulv.qbuilders.builders.QBuilder;
import com.github.rutledgepaulv.qbuilders.conditions.Condition;
import com.github.rutledgepaulv.qbuilders.properties.concrete.StringProperty;

/**
 * Created by wohlgemuth on 5/31/16.
 */
public interface RegexStringField <T extends QBuilder<T>> extends StringProperty<T> {

    Condition<T> regex(String pattern);

}

