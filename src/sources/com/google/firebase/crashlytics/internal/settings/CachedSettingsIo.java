package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CachedSettingsIo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f18913a;

    public CachedSettingsIo(FileStore fileStore) {
        this.f18913a = new File(fileStore.f18882c, "com.crashlytics.settings.json");
    }
}
