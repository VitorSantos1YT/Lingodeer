package com.google.android.datatransport.runtime.util;

import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import java.util.HashMap;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class PriorityMapping {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f8235a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f8236b;

    static {
        HashMap map = new HashMap();
        f8236b = map;
        map.put(Priority.DEFAULT, 0);
        map.put(Priority.VERY_LOW, 1);
        map.put(Priority.HIGHEST, 2);
        for (Priority priority : map.keySet()) {
            f8235a.append(((Integer) f8236b.get(priority)).intValue(), priority);
        }
    }

    public static int a(Priority priority) {
        Integer num = (Integer) f8236b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    public static Priority b(int i11) {
        Priority priority = (Priority) f8235a.get(i11);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException(p.j(i11, "Unknown Priority for value "));
    }
}
