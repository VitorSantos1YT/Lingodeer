package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import ce.a0;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f7657c = new g(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7659b;

    public h() {
        this.f7658a = 0;
        this.f7659b = new HashMap();
    }

    @Override // com.bumptech.glide.load.data.f
    public Object a() {
        switch (this.f7658a) {
            case 1:
                return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f7659b).rewind();
            case 2:
                return this.f7659b;
            default:
                a0 a0Var = (a0) this.f7659b;
                a0Var.reset();
                return a0Var;
        }
    }

    @Override // com.bumptech.glide.load.data.f
    public void b() {
        switch (this.f7658a) {
            case 1:
            case 2:
                break;
            default:
                ((a0) this.f7659b).release();
                break;
        }
    }

    public ParcelFileDescriptor e() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f7659b).rewind();
    }

    public h(InputStream inputStream, m0.n nVar) {
        this.f7658a = 3;
        a0 a0Var = new a0(inputStream, nVar);
        this.f7659b = a0Var;
        a0Var.mark(5242880);
    }

    public h(ParcelFileDescriptor parcelFileDescriptor) {
        this.f7658a = 1;
        this.f7659b = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public h(Object obj) {
        this.f7658a = 2;
        this.f7659b = obj;
    }

    private final void c() {
    }

    private final void d() {
    }
}
