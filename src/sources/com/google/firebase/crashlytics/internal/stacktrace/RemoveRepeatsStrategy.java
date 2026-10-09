package com.google.firebase.crashlytics.internal.stacktrace;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class RemoveRepeatsStrategy implements StackTraceTrimmingStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18949a;

    public RemoveRepeatsStrategy() {
        this(1);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    @Override // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int i11;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i12 = 0;
        int i13 = 0;
        int i14 = 1;
        while (i12 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i12];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null) {
                stackTraceElementArr2[i13] = stackTraceElementArr[i12];
                i13++;
                i14 = 1;
                i11 = i12;
                break;
                break;
            }
            int iIntValue = num.intValue();
            int i15 = i12 - iIntValue;
            if (i12 + i15 <= stackTraceElementArr.length) {
                int i16 = 0;
                while (true) {
                    if (i16 >= i15) {
                        int iIntValue2 = i12 - num.intValue();
                        if (i14 < this.f18949a) {
                            System.arraycopy(stackTraceElementArr, i12, stackTraceElementArr2, i13, iIntValue2);
                            i13 += iIntValue2;
                            i14++;
                        }
                        i11 = (iIntValue2 - 1) + i12;
                        break;
                    }
                    if (!stackTraceElementArr[iIntValue + i16].equals(stackTraceElementArr[i12 + i16])) {
                        stackTraceElementArr2[i13] = stackTraceElementArr[i12];
                        i13++;
                        i14 = 1;
                        i11 = i12;
                        break;
                        break;
                    }
                    i16++;
                }
            } else {
                stackTraceElementArr2[i13] = stackTraceElementArr[i12];
                i13++;
                i14 = 1;
                i11 = i12;
                break;
            }
            map.put(stackTraceElement, Integer.valueOf(i12));
            i12 = i11 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i13];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i13);
        return i13 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    public RemoveRepeatsStrategy(int i11) {
        this.f18949a = i11;
    }
}
