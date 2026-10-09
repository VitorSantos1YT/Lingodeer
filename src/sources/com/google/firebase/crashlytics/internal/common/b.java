package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18350a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f18350a) {
            case 0:
                b bVar = CrashlyticsController.f18258r;
                return str.startsWith(".ae");
            default:
                return str.startsWith("aqs.");
        }
    }
}
