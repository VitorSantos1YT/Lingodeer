package com.google.firebase.crashlytics.internal.stacktrace;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class TrimmedThrowableData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f18952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TrimmedThrowableData f18953d;

    public TrimmedThrowableData(String str, String str2, StackTraceElement[] stackTraceElementArr, TrimmedThrowableData trimmedThrowableData) {
        this.f18950a = str;
        this.f18951b = str2;
        this.f18952c = stackTraceElementArr;
        this.f18953d = trimmedThrowableData;
    }
}
