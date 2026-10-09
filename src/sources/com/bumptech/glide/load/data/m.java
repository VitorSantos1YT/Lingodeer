package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f7675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContentResolver f7676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7677d;

    public m(ContentResolver contentResolver, Uri uri, boolean z11) {
        this.f7676c = contentResolver;
        this.f7675b = uri;
        this.f7674a = z11;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        Object obj = this.f7677d;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(Object obj);

    @Override // com.bumptech.glide.load.data.d
    public final td.a d() {
        return td.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.k kVar, c cVar) {
        try {
            Object objF = f(this.f7676c, this.f7675b);
            this.f7677d = objF;
            cVar.f(objF);
        } catch (FileNotFoundException e8) {
            cVar.c(e8);
        }
    }

    public abstract Object f(ContentResolver contentResolver, Uri uri);

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}
