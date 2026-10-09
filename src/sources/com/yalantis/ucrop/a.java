package com.yalantis.ucrop;

import android.view.View;
import b7.k;
import g7.b;
import g7.i;
import y6.h0;
import y6.i0;
import z4.u;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements u, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22416b;

    public /* synthetic */ a(int i11, int i12) {
        this.f22415a = i12;
        this.f22416b = i11;
    }

    @Override // z4.u
    public v1 e(View view, v1 v1Var) {
        return UCropActivity.lambda$setupViews$0(this.f22416b, view, v1Var);
    }

    @Override // b7.k
    public void invoke(Object obj) {
        switch (this.f22415a) {
            case 1:
                ((h0) obj).t(this.f22416b);
                break;
            case 2:
                ((h0) obj).j(this.f22416b);
                break;
            default:
                b bVar = (b) obj;
                bVar.getClass();
                i iVar = (i) bVar;
                int i11 = this.f22416b;
                if (i11 == 1) {
                    iVar.f28847v = true;
                }
                iVar.f28838l = i11;
                break;
        }
    }

    public /* synthetic */ a(g7.a aVar, int i11, i0 i0Var, i0 i0Var2) {
        this.f22415a = 3;
        this.f22416b = i11;
    }
}
