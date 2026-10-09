package vd;

import android.util.Log;
import com.bumptech.glide.Registry$MissingComponentException;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import qp.m3;
import qp.o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f53916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f53917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final he.b f53918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y4.c f53919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f53920e;

    public m(Class cls, Class cls2, Class cls3, List list, he.b bVar, y4.c cVar) {
        this.f53916a = cls;
        this.f53917b = list;
        this.f53918c = bVar;
        this.f53919d = cVar;
        this.f53920e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final b0 a(int i11, int i12, com.bumptech.glide.load.data.f fVar, o2 o2Var, td.j jVar) {
        b0 b0VarB;
        td.n nVar;
        td.c cVarD;
        boolean z11;
        boolean z12;
        boolean z13;
        Object eVar;
        y4.c cVar = this.f53919d;
        List list = (List) cVar.acquire();
        pe.f.c(list, "Argument must not be null");
        try {
            b0 b0VarB2 = b(fVar, i11, i12, jVar, list);
            cVar.c(list);
            l lVar = (l) o2Var.f48096c;
            td.a aVar = (td.a) o2Var.f48095b;
            h hVar = lVar.f53901a;
            Class<?> cls = b0VarB2.get().getClass();
            td.m mVarB = null;
            if (aVar != td.a.RESOURCE_DISK_CACHE) {
                td.n nVarE = hVar.e(cls);
                nVar = nVarE;
                b0VarB = nVarE.b(lVar.H, b0VarB2, lVar.N, lVar.O);
            } else {
                b0VarB = b0VarB2;
                nVar = null;
            }
            if (!b0VarB2.equals(b0VarB)) {
                b0VarB2.b();
            }
            if (hVar.f53882c.a().f7643d.b(b0VarB.d()) != null) {
                mVarB = hVar.f53882c.a().f7643d.b(b0VarB.d());
                if (mVarB == null) {
                    final Class clsD = b0VarB.d();
                    throw new Registry$MissingComponentException(clsD) { // from class: com.bumptech.glide.Registry$NoResultEncoderAvailableException
                        {
                            super("Failed to find result encoder for resource class: " + clsD + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
                        }
                    };
                }
                cVarD = mVarB.d(lVar.Q);
            } else {
                cVarD = td.c.NONE;
            }
            td.m mVar = mVarB;
            td.g gVar = lVar.Z;
            ArrayList arrayListB = hVar.b();
            int size = arrayListB.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    z11 = false;
                    break;
                }
                if (((zd.p) arrayListB.get(i13)).f59180a.equals(gVar)) {
                    z11 = true;
                    break;
                }
                i13++;
            }
            switch (lVar.P.f53924a) {
                default:
                    if (((!z11 && aVar == td.a.DATA_DISK_CACHE) || aVar == td.a.LOCAL) && cVarD == td.c.TRANSFORMED) {
                        z12 = true;
                        break;
                    }
                case 0:
                case 1:
                    z12 = false;
                    break;
            }
            if (z12) {
                if (mVar == null) {
                    final Class<?> cls2 = b0VarB.get().getClass();
                    throw new Registry$MissingComponentException(cls2) { // from class: com.bumptech.glide.Registry$NoResultEncoderAvailableException
                        {
                            super("Failed to find result encoder for resource class: " + cls2 + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
                        }
                    };
                }
                int i14 = i.f53899c[cVarD.ordinal()];
                if (i14 == 1) {
                    z13 = true;
                    eVar = new e(lVar.Z, lVar.K);
                } else {
                    if (i14 != 2) {
                        throw new IllegalArgumentException("Unknown strategy: " + cVarD);
                    }
                    z13 = true;
                    eVar = new d0(hVar.f53882c.f7629a, lVar.Z, lVar.K, lVar.N, lVar.O, nVar, cls, lVar.Q);
                }
                a0 a0Var = (a0) a0.f53840e.acquire();
                a0Var.f53844d = 0;
                a0Var.f53843c = z13;
                a0Var.f53842b = b0VarB;
                m3 m3Var = lVar.f53911f;
                m3Var.f48056a = eVar;
                m3Var.f48057b = mVar;
                m3Var.f48058c = a0Var;
                b0VarB = a0Var;
            }
            return this.f53918c.k(b0VarB, jVar);
        } catch (Throwable th2) {
            cVar.c(list);
            throw th2;
        }
    }

    public final b0 b(com.bumptech.glide.load.data.f fVar, int i11, int i12, td.j jVar, List list) throws GlideException {
        List list2 = this.f53917b;
        int size = list2.size();
        b0 b0VarA = null;
        for (int i13 = 0; i13 < size; i13++) {
            td.l lVar = (td.l) list2.get(i13);
            try {
                if (lVar.b(fVar.a(), jVar)) {
                    b0VarA = lVar.a(fVar.a(), i11, i12, jVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e8) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(lVar);
                }
                list.add(e8);
            }
            if (b0VarA != null) {
                break;
            }
        }
        if (b0VarA != null) {
            return b0VarA;
        }
        throw new GlideException(this.f53920e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f53916a + ", decoders=" + this.f53917b + ", transcoder=" + this.f53918c + '}';
    }
}
