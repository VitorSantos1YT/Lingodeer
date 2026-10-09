package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AssetManager f7665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f7666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7667d;

    public j(AssetManager assetManager, String str, int i11) {
        this.f7667d = i11;
        this.f7665b = assetManager;
        this.f7664a = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f7667d) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        Object obj = this.f7666c;
        if (obj == null) {
            return;
        }
        try {
            switch (this.f7667d) {
                case 0:
                    ((AssetFileDescriptor) obj).close();
                    break;
                default:
                    ((InputStream) obj).close();
                    break;
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final td.a d() {
        return td.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.k kVar, c cVar) {
        Object objOpenFd;
        try {
            AssetManager assetManager = this.f7665b;
            String str = this.f7664a;
            switch (this.f7667d) {
                case 0:
                    objOpenFd = assetManager.openFd(str);
                    break;
                default:
                    objOpenFd = assetManager.open(str);
                    break;
            }
            this.f7666c = objOpenFd;
            cVar.f(objOpenFd);
        } catch (IOException e8) {
            cVar.c(e8);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}
