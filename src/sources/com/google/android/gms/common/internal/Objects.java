package com.google.android.gms.common.internal;

import java.util.ArrayList;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class Objects {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ToStringHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f8942a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f8943b;

        public /* synthetic */ ToStringHelper(Object obj) {
            this.f8943b = obj;
        }

        public final void a(Object obj, String str) {
            int length = str.length();
            String strValueOf = String.valueOf(obj);
            this.f8942a.add(p.u(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f8943b.getClass().getSimpleName());
            sb2.append('{');
            ArrayList arrayList = this.f8942a;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                sb2.append((String) arrayList.get(i11));
                if (i11 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    private Objects() {
        throw new AssertionError("Uninstantiable");
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
