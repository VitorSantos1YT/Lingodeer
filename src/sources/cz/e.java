package cz;

import java.io.File;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File[] f22612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22613d;

    @Override // cz.h
    public final File a() {
        boolean z11 = this.f22611b;
        File file = this.f22617a;
        if (!z11) {
            this.f22611b = true;
            return file;
        }
        File[] fileArr = this.f22612c;
        if (fileArr != null && this.f22613d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f22612c = fileArrListFiles;
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return null;
            }
        }
        File[] fileArr2 = this.f22612c;
        m.c(fileArr2);
        int i11 = this.f22613d;
        this.f22613d = i11 + 1;
        return fileArr2[i11];
    }
}
