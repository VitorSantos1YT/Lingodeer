package com.lingodeer.data.env;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import oz.x;
import qy.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class StorageLocationMgr {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_LOC_BELOW_KITKAT = "com.lingodeer/files";
    private final Context mContext;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final File getExtraSDCardDir(Context context) {
            m.f(context, "context");
            File[] externalFilesDirs = context.getExternalFilesDirs(null);
            if (externalFilesDirs.length > 1) {
                return externalFilesDirs[1];
            }
            return null;
        }

        public final boolean hasExtraSDCard(Context context) {
            m.f(context, "context");
            return context.getExternalFilesDirs(null).length > 1 && context.getExternalFilesDirs(null)[1] != null;
        }

        private Companion() {
        }
    }

    public StorageLocationMgr(Context mContext) {
        m.f(mContext, "mContext");
        this.mContext = mContext;
    }

    public final File checkAvailable(String loc) {
        m.f(loc, "loc");
        if (loc.equals("phone")) {
            File filesDir = this.mContext.getFilesDir();
            if (filesDir == null || !filesDir.canWrite()) {
                return null;
            }
            return filesDir;
        }
        File externalFilesDir = this.mContext.getExternalFilesDir(null);
        if (externalFilesDir == null || !externalFilesDir.canWrite()) {
            return null;
        }
        return externalFilesDir;
    }

    public final String getStoragePos(String str) {
        File extraSDCardDir;
        File filesDir;
        if (!x.l0(str, null, false)) {
            if (x.l0(str, "phone", false) && (filesDir = this.mContext.getFilesDir()) != null) {
                return filesDir.getPath();
            }
            if (x.l0(str, "sdcard", false)) {
                File externalFilesDir = this.mContext.getExternalFilesDir(null);
                if (externalFilesDir != null) {
                    return externalFilesDir.getPath();
                }
            } else if (x.l0(str, "extra", false) && (extraSDCardDir = Companion.getExtraSDCardDir(this.mContext)) != null) {
                return extraSDCardDir.getPath();
            }
        }
        return null;
    }

    public final l pickupNewAvailLoc(String str) {
        File filesDir;
        File externalFilesDir;
        if ((!x.l0(str, null, false) || !x.l0(str, "phone", false)) && (filesDir = this.mContext.getFilesDir()) != null && filesDir.canWrite()) {
            return new l("phone", filesDir);
        }
        if ((x.l0(str, null, false) && x.l0(str, "sdcard", false)) || (externalFilesDir = this.mContext.getExternalFilesDir(null)) == null || !externalFilesDir.canWrite()) {
            return null;
        }
        return new l("sdcard", externalFilesDir);
    }
}
