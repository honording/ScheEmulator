package org.hding.ScheEmulator.sw;

import org.hding.ScheEmulator.base.Pair;

/**
 * Created by hding on 1/10/16.
 */
public class WorkGroup extends BaseElement {
    int id;
    Kernel belongsTo;
    public WorkGroup(Pair topLeft, Pair length) {
        super(topLeft, length);
    }
}
