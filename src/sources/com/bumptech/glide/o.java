package com.bumptech.glide;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements ie.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ie.o f7691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f7692b;

    public o(p pVar, ie.o oVar) {
        this.f7692b = pVar;
        this.f7691a = oVar;
    }

    @Override // ie.a
    public final void a(boolean z11) {
        if (z11) {
            synchronized (this.f7692b) {
                ie.o oVar = this.f7691a;
                ArrayList arrayListE = pe.m.e((Set) oVar.f34406c);
                int size = arrayListE.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayListE.get(i11);
                    i11++;
                    le.c cVar = (le.c) obj;
                    if (!cVar.b() && !cVar.h()) {
                        cVar.clear();
                        if (oVar.f34405b) {
                            ((HashSet) oVar.f34407d).add(cVar);
                        } else {
                            cVar.j();
                        }
                    }
                }
            }
        }
    }
}
