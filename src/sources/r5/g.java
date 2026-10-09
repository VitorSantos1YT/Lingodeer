package r5;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.i;
import androidx.datastore.preferences.protobuf.o;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import jh.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import n5.s0;
import q5.j;
import q5.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f48824a = new g();

    @Override // n5.s0
    public final Object a() {
        return new b(true);
    }

    @Override // n5.s0
    public final Object b(FileInputStream fileInputStream) throws CorruptionException {
        byte[] bArr;
        try {
            q5.f fVarO = q5.f.o(fileInputStream);
            b bVar = new b(false);
            e[] pairs = (e[]) Arrays.copyOf(new e[0], 0);
            m.f(pairs, "pairs");
            bVar.b();
            if (pairs.length > 0) {
                e eVar = pairs[0];
                throw null;
            }
            Map mapM = fVarO.m();
            m.e(mapM, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapM.entrySet()) {
                String name = (String) entry.getKey();
                k value = (k) entry.getValue();
                m.e(name, "name");
                m.e(value, "value");
                j jVarC = value.C();
                switch (jVarC == null ? -1 : f.f48823a[jVarC.ordinal()]) {
                    case -1:
                        throw new CorruptionException("Value case is null.", null);
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        bVar.f(new d(name), Boolean.valueOf(value.t()));
                        break;
                    case 2:
                        bVar.f(new d(name), Float.valueOf(value.x()));
                        break;
                    case 3:
                        bVar.f(new d(name), Double.valueOf(value.w()));
                        break;
                    case 4:
                        bVar.f(new d(name), Integer.valueOf(value.y()));
                        break;
                    case 5:
                        bVar.f(new d(name), Long.valueOf(value.z()));
                        break;
                    case 6:
                        d dVarW = h.w(name);
                        String strA = value.A();
                        m.e(strA, "value.string");
                        bVar.f(dVarW, strA);
                        break;
                    case 7:
                        d dVarX = h.x(name);
                        d0 d0VarN = value.B().n();
                        m.e(d0VarN, "value.stringSet.stringsList");
                        bVar.f(dVarX, ry.m.f1(d0VarN));
                        break;
                    case 8:
                        d dVar = new d(name);
                        i iVarU = value.u();
                        int size = iVarU.size();
                        if (size == 0) {
                            bArr = e0.f1464b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            iVarU.f(bArr2, size);
                            bArr = bArr2;
                        }
                        m.e(bArr, "value.bytes.toByteArray()");
                        bVar.f(dVar, bArr);
                        break;
                    case 9:
                        throw new CorruptionException("Value not set.", null);
                }
            }
            return bVar.h();
        } catch (InvalidProtocolBufferException e8) {
            throw new CorruptionException("Unable to parse preferences proto.", e8);
        }
    }

    @Override // n5.s0
    public final void c(Object obj, m00.h hVar) throws IOException {
        c0 c0VarA;
        Map mapA = ((b) obj).a();
        q5.d dVarN = q5.f.n();
        for (Map.Entry entry : mapA.entrySet()) {
            d dVar = (d) entry.getKey();
            Object value = entry.getValue();
            String str = dVar.f48822a;
            if (value instanceof Boolean) {
                q5.i iVarD = k.D();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                iVarD.d();
                k.q((k) iVarD.f1581b, zBooleanValue);
                c0VarA = iVarD.a();
            } else if (value instanceof Float) {
                q5.i iVarD2 = k.D();
                float fFloatValue = ((Number) value).floatValue();
                iVarD2.d();
                k.r((k) iVarD2.f1581b, fFloatValue);
                c0VarA = iVarD2.a();
            } else if (value instanceof Double) {
                q5.i iVarD3 = k.D();
                double dDoubleValue = ((Number) value).doubleValue();
                iVarD3.d();
                k.o((k) iVarD3.f1581b, dDoubleValue);
                c0VarA = iVarD3.a();
            } else if (value instanceof Integer) {
                q5.i iVarD4 = k.D();
                int iIntValue = ((Number) value).intValue();
                iVarD4.d();
                k.s((k) iVarD4.f1581b, iIntValue);
                c0VarA = iVarD4.a();
            } else if (value instanceof Long) {
                q5.i iVarD5 = k.D();
                long jLongValue = ((Number) value).longValue();
                iVarD5.d();
                k.l((k) iVarD5.f1581b, jLongValue);
                c0VarA = iVarD5.a();
            } else if (value instanceof String) {
                q5.i iVarD6 = k.D();
                iVarD6.d();
                k.m((k) iVarD6.f1581b, (String) value);
                c0VarA = iVarD6.a();
            } else if (value instanceof Set) {
                q5.i iVarD7 = k.D();
                q5.g gVarO = q5.h.o();
                gVarO.d();
                q5.h.l((q5.h) gVarO.f1581b, (Set) value);
                iVarD7.d();
                k.n((k) iVarD7.f1581b, (q5.h) gVarO.a());
                c0VarA = iVarD7.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                q5.i iVarD8 = k.D();
                byte[] bArr = (byte[]) value;
                androidx.datastore.preferences.protobuf.h hVarE = i.e(bArr, 0, bArr.length);
                iVarD8.d();
                k.p((k) iVarD8.f1581b, hVarE);
                c0VarA = iVarD8.a();
            }
            dVarN.getClass();
            str.getClass();
            dVarN.d();
            q5.f.l((q5.f) dVarN.f1581b).put(str, (k) c0VarA);
        }
        q5.f fVar = (q5.f) dVarN.a();
        int iA = fVar.a(null);
        Logger logger = o.f1523f;
        if (iA > 4096) {
            iA = 4096;
        }
        o oVar = new o(hVar, iA);
        fVar.b(oVar);
        if (oVar.f1528d > 0) {
            oVar.i0();
        }
    }
}
