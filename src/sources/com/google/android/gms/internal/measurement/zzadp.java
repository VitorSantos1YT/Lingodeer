package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzadp;
import com.google.android.gms.internal.measurement.zzadu;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class zzadp<MessageType extends zzadu<MessageType, BuilderType>, BuilderType extends zzadp<MessageType, BuilderType>> extends zzaca<MessageType, BuilderType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzadu f11265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzadu f11266b;

    public zzadp(zzadu zzaduVar) {
        this.f11265a = zzaduVar;
        if (zzaduVar.l()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f11266b = zzaduVar.n();
    }

    public final /* bridge */ /* synthetic */ zzaca l(byte[] bArr, int i11) throws zzaeh {
        zzadf zzadfVar = zzadf.f11253b;
        int i12 = zzacf.f11197a;
        r(bArr, i11, zzadf.f11254c);
        return this;
    }

    public final void m() {
        if (this.f11266b.l()) {
            return;
        }
        zzadu zzaduVarN = this.f11265a.n();
        zzafl.f11317c.a(zzaduVarN.getClass()).c(zzaduVarN, this.f11266b);
        this.f11266b = zzaduVarN;
    }

    @Override // com.google.android.gms.internal.measurement.zzaca
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final zzadp clone() {
        zzadp zzadpVar = (zzadp) this.f11265a.x(5);
        zzadpVar.f11266b = S0();
        return zzadpVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzafb
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final zzadu S0() {
        if (!this.f11266b.l()) {
            return this.f11266b;
        }
        this.f11266b.o();
        return this.f11266b;
    }

    public final zzadu p() {
        zzadu zzaduVarS0 = S0();
        zzaduVarS0.getClass();
        if (zzadu.v(zzaduVarS0, true)) {
            return zzaduVarS0;
        }
        throw new zzafy();
    }

    public final void q(zzadu zzaduVar) {
        zzadu zzaduVar2 = this.f11265a;
        if (zzaduVar2.equals(zzaduVar)) {
            return;
        }
        if (!this.f11266b.l()) {
            zzadu zzaduVarN = zzaduVar2.n();
            zzafl.f11317c.a(zzaduVarN.getClass()).c(zzaduVarN, this.f11266b);
            this.f11266b = zzaduVarN;
        }
        zzadu zzaduVar3 = this.f11266b;
        zzafl.f11317c.a(zzaduVar3.getClass()).c(zzaduVar3, zzaduVar);
    }

    public final void r(byte[] bArr, int i11, zzadf zzadfVar) throws zzaeh {
        if (!this.f11266b.l()) {
            zzadu zzaduVarN = this.f11265a.n();
            zzafl.f11317c.a(zzaduVarN.getClass()).c(zzaduVarN, this.f11266b);
            this.f11266b = zzaduVarN;
        }
        try {
            zzafl.f11317c.a(this.f11266b.getClass()).f(this.f11266b, bArr, 0, i11, new zzacg(zzadfVar));
        } catch (zzaeh e8) {
            throw e8;
        } catch (IOException e10) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e10);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
