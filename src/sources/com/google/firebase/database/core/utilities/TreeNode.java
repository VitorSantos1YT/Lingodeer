package com.google.firebase.database.core.utilities;

import defpackage.e;
import ep.a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class TreeNode<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f19430a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f19431b;

    public final String a(String str) {
        StringBuilder sbR = e.r(str, "<value>: ");
        sbR.append(this.f19431b);
        sbR.append("\n");
        String string = sbR.toString();
        HashMap map = this.f19430a;
        if (map.isEmpty()) {
            return a.D(string, str, "<empty>");
        }
        for (Map.Entry entry : map.entrySet()) {
            StringBuilder sbR2 = e.r(string, str);
            sbR2.append(entry.getKey());
            sbR2.append(":\n");
            sbR2.append(((TreeNode) entry.getValue()).a(str + "\t"));
            sbR2.append("\n");
            string = sbR2.toString();
        }
        return string;
    }
}
