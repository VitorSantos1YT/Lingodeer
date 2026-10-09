package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzabv implements zzabu {
    @Override // com.google.android.gms.internal.measurement.zzabu
    public final StackTraceElement[] f(int i11) {
        if (!(i11 == -1 || i11 > 0)) {
            throw new IllegalArgumentException("maxDepth must be > 0 or -1");
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String name = zzxz.class.getName();
        int i12 = 3;
        boolean z11 = false;
        while (true) {
            if (i12 >= stackTrace.length) {
                i12 = -1;
                break;
            }
            if (stackTrace[i12].getClassName().equals(name)) {
                z11 = true;
            } else if (z11) {
                break;
            }
            i12++;
        }
        if (i12 == -1) {
            return new StackTraceElement[0];
        }
        int length = stackTrace.length - i12;
        if (i11 <= 0 || i11 >= length) {
            i11 = length;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i11];
        System.arraycopy(stackTrace, i12, stackTraceElementArr, 0, i11);
        return stackTraceElementArr;
    }
}
