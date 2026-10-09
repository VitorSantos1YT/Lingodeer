package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzfe;
import com.google.android.gms.internal.play_billing.zzfi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class zzfe<MessageType extends zzfi<MessageType, BuilderType>, BuilderType extends zzfe<MessageType, BuilderType>> extends zzdr<MessageType, BuilderType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzfi f12377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzfi f12378b;

    public zzfe(zzfi zzfiVar) {
        this.f12377a = zzfiVar;
        if (zzfiVar.o()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f12378b = (zzfi) zzfiVar.f(4);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdr
    public final Object clone() {
        zzfe zzfeVar = (zzfe) this.f12377a.f(5);
        zzfeVar.f12378b = zzg();
        return zzfeVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdr
    /* JADX INFO: renamed from: d */
    public final zzfe clone() {
        zzfe zzfeVar = (zzfe) this.f12377a.f(5);
        zzfeVar.f12378b = zzg();
        return zzfeVar;
    }

    public final zzfi f() {
        zzfi zzfiVarZzg = zzg();
        zzfiVarZzg.getClass();
        if (zzfi.e(zzfiVarZzg, true)) {
            return zzfiVarZzg;
        }
        throw new zzhg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzgk
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final zzfi zzg() {
        if (!this.f12378b.o()) {
            return this.f12378b;
        }
        this.f12378b.k();
        return this.f12378b;
    }

    public final void h() {
        if (this.f12378b.o()) {
            return;
        }
        zzfi zzfiVar = (zzfi) this.f12377a.f(4);
        zzgs.f12418c.a(zzfiVar.getClass()).zzg(zzfiVar, this.f12378b);
        this.f12378b = zzfiVar;
    }
}
