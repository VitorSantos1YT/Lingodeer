package com.google.android.material.color.utilities;

import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f14297b;

    public /* synthetic */ b(MaterialDynamicColors materialDynamicColors, int i11) {
        this.f14296a = i11;
        this.f14297b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f14296a) {
            case 0:
                MaterialDynamicColors materialDynamicColors = this.f14297b;
                materialDynamicColors.g();
                materialDynamicColors.f();
                return new ToneDeltaPair();
            case 1:
                MaterialDynamicColors materialDynamicColors2 = this.f14297b;
                materialDynamicColors2.k();
                materialDynamicColors2.j();
                return new ToneDeltaPair();
            case 2:
                MaterialDynamicColors materialDynamicColors3 = this.f14297b;
                materialDynamicColors3.i();
                materialDynamicColors3.h();
                return new ToneDeltaPair();
            case 3:
                MaterialDynamicColors materialDynamicColors4 = this.f14297b;
                materialDynamicColors4.g();
                materialDynamicColors4.f();
                return new ToneDeltaPair();
            case 4:
                return this.f14297b.f();
            case 5:
                return this.f14297b.a();
            case 6:
                return this.f14297b.g();
            case 7:
                MaterialDynamicColors materialDynamicColors5 = this.f14297b;
                materialDynamicColors5.k();
                materialDynamicColors5.j();
                return new ToneDeltaPair();
            case 8:
                return this.f14297b.h();
            case 9:
                MaterialDynamicColors materialDynamicColors6 = this.f14297b;
                materialDynamicColors6.i();
                materialDynamicColors6.h();
                return new ToneDeltaPair();
            case 10:
                return this.f14297b.j();
            case 11:
                return this.f14297b.k();
            case 12:
                return this.f14297b.i();
            case 13:
                MaterialDynamicColors materialDynamicColors7 = this.f14297b;
                materialDynamicColors7.b();
                materialDynamicColors7.a();
                return new ToneDeltaPair();
            case 14:
                return this.f14297b.b();
            default:
                MaterialDynamicColors materialDynamicColors8 = this.f14297b;
                materialDynamicColors8.b();
                materialDynamicColors8.a();
                return new ToneDeltaPair();
        }
    }
}
