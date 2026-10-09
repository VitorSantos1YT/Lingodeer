package com.chad.library.adapter.base.util;

import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class TouchEventUtil {
    public static String getTouchAction(int i11) {
        String strJ = p.j(i11, "Unknow:id=");
        if (i11 == 0) {
            return "ACTION_DOWN";
        }
        if (i11 == 1) {
            return "ACTION_UP";
        }
        if (i11 == 2) {
            return "ACTION_MOVE";
        }
        if (i11 != 3) {
            return i11 != 4 ? strJ : "ACTION_OUTSIDE";
        }
        return "ACTION_CANCEL";
    }
}
