package com.android.billingclient.api;

import android.text.TextUtils;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements v5.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f7458b;

    @Override // v5.n
    public boolean d(CharSequence charSequence, int i11, int i12, v5.v vVar) {
        if (!TextUtils.equals(charSequence.subSequence(i11, i12), this.f7458b)) {
            return true;
        }
        vVar.f53564c = (vVar.f53564c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.f7457a) {
            case 2:
                return p0.o(new StringBuilder("<"), this.f7458b, '>');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(String str, int i11) {
        this.f7457a = i11;
        this.f7458b = str;
    }

    @Override // v5.n
    public Object b() {
        return this;
    }
}
