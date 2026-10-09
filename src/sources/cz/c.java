package cz;

import java.io.File;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File[] f22607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22609e;

    @Override // cz.h
    public final File a() {
        boolean z11 = this.f22609e;
        File file = this.f22617a;
        if (!z11 && this.f22607c == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f22607c = fileArrListFiles;
            if (fileArrListFiles == null) {
                this.f22609e = true;
            }
        }
        File[] fileArr = this.f22607c;
        if (fileArr == null || this.f22608d >= fileArr.length) {
            if (this.f22606b) {
                return null;
            }
            this.f22606b = true;
            return file;
        }
        m.c(fileArr);
        int i11 = this.f22608d;
        this.f22608d = i11 + 1;
        return fileArr[i11];
    }
}
