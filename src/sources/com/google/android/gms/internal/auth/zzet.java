package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzet;
import com.google.android.gms.internal.auth.zzev;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zzet<MessageType extends zzev<MessageType, BuilderType>, BuilderType extends zzet<MessageType, BuilderType>> extends zzdp<MessageType, BuilderType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzev f9497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzev f9498b;

    public zzet(zzhs zzhsVar) {
        this.f9497a = zzhsVar;
        if (zzhsVar.f()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f9498b = (zzev) zzhsVar.g(4);
    }

    @Override // com.google.android.gms.internal.auth.zzdp
    /* JADX INFO: renamed from: a */
    public final zzet clone() {
        zzev zzevVar;
        zzet zzetVar = (zzet) this.f9497a.g(5);
        if (this.f9498b.f()) {
            zzev zzevVar2 = this.f9498b;
            zzevVar2.getClass();
            zzgf.f9532c.a(zzevVar2.getClass()).a(zzevVar2);
            zzevVar2.c();
            zzevVar = this.f9498b;
        } else {
            zzevVar = this.f9498b;
        }
        zzetVar.f9498b = zzevVar;
        return zzetVar;
    }

    @Override // com.google.android.gms.internal.auth.zzdp
    public final Object clone() {
        zzev zzevVar;
        zzet zzetVar = (zzet) this.f9497a.g(5);
        if (this.f9498b.f()) {
            zzev zzevVar2 = this.f9498b;
            zzevVar2.getClass();
            zzgf.f9532c.a(zzevVar2.getClass()).a(zzevVar2);
            zzevVar2.c();
            zzevVar = this.f9498b;
        } else {
            zzevVar = this.f9498b;
        }
        zzetVar.f9498b = zzevVar;
        return zzetVar;
    }
}
