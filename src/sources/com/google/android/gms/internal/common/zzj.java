package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzj {
    public static Object a(Class cls, String str, zzi... zziVarArr) {
        int length = zziVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i11 = 0; i11 < zziVarArr.length; i11++) {
            zzi zziVar = zziVarArr[i11];
            zziVar.getClass();
            clsArr[i11] = zziVar.f9625a;
            objArr[i11] = zziVarArr[i11].f9626b;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }
}
