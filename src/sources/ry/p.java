package ry;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p extends o {
    public static void Y(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void Z(List list, Comparator comparator) {
        kotlin.jvm.internal.m.f(list, "<this>");
        kotlin.jvm.internal.m.f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
