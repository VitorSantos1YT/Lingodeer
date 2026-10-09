package ga;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import com.android.billingclient.api.h;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dl.ExOZ.xItStCyvVEZ;
import ha.i;
import ha.q;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.m;
import qy.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ub.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bundle f28889k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f28890l;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h f28891n;

    public static void j0(d dVar, e00.g gVar, Bundle bundle) {
        if (dVar.f28882b == 1 && !bundle.containsKey("type")) {
            if (m.a(gVar.e(), e00.m.f24700c) || m.a(gVar.e(), e00.m.f24703f)) {
                ef.e.x("type", gVar.a(), bundle);
            }
        }
    }

    @Override // ub.a, f00.d
    public final void C(long j11) {
        Bundle source = this.f28889k;
        m.f(source, "source");
        String key = this.m;
        m.f(key, "key");
        source.putLong(key, j11);
    }

    @Override // ub.a, f00.d
    public final void F(String value) {
        m.f(value, "value");
        Bundle source = this.f28889k;
        m.f(source, "source");
        ef.e.x(this.m, value, source);
    }

    @Override // ub.a, f00.b
    public final boolean G(e00.g descriptor) {
        m.f(descriptor, "descriptor");
        this.f28890l.getClass();
        return false;
    }

    @Override // ub.a
    public final void S(e00.g descriptor, int i11) {
        m.f(descriptor, "descriptor");
        String strG = descriptor.g(i11);
        this.m = strG;
        if (this.f28890l.f28882b == 1) {
            Bundle bundle = this.f28889k;
            boolean zContainsKey = bundle.containsKey("type");
            boolean zA = m.a(strG, "type");
            if (zContainsKey && zA) {
                throw new IllegalArgumentException(ep.a.h("SavedStateEncoder for ", com.bumptech.glide.f.w("type", bundle), " has property '", strG, "' that conflicts with the class discriminator. You can rename a property with @SerialName annotation."));
            }
        }
    }

    @Override // f00.d
    public final h a() {
        return this.f28891n;
    }

    @Override // ub.a, f00.d
    public final f00.b d(e00.g descriptor) {
        m.f(descriptor, "descriptor");
        boolean zA = m.a(this.m, BuildConfig.VERSION_NAME);
        Bundle bundle = this.f28889k;
        d dVar = this.f28890l;
        if (zA) {
            j0(dVar, descriptor, bundle);
            return this;
        }
        Bundle bundleB = jh.h.b((l[]) Arrays.copyOf(new l[0], 0));
        ef.e.w(bundle, this.m, bundleB);
        j0(dVar, descriptor, bundleB);
        return new g(bundleB, dVar);
    }

    @Override // ub.a, f00.d
    public final void j(double d5) {
        Bundle source = this.f28889k;
        m.f(source, "source");
        String key = this.m;
        m.f(key, "key");
        source.putDouble(key, d5);
    }

    @Override // ub.a, f00.d
    public final void k(short s3) {
        String key = this.m;
        m.f(key, "key");
        this.f28889k.putInt(key, s3);
    }

    @Override // ub.a, f00.d
    public final void m(byte b3) {
        String key = this.m;
        m.f(key, "key");
        this.f28889k.putInt(key, b3);
    }

    @Override // ub.a, f00.d
    public final void o(boolean z11) {
        String key = this.m;
        m.f(key, "key");
        this.f28889k.putBoolean(key, z11);
    }

    @Override // ub.a, f00.d
    public final void p(float f5) {
        Bundle source = this.f28889k;
        m.f(source, "source");
        String key = this.m;
        m.f(key, "key");
        source.putFloat(key, f5);
    }

    @Override // ub.a, f00.d
    public final void s(e00.g enumDescriptor, int i11) {
        m.f(enumDescriptor, "enumDescriptor");
        String key = this.m;
        m.f(key, "key");
        this.f28889k.putInt(key, i11);
    }

    @Override // ub.a, f00.d
    public final void z(int i11) {
        String key = this.m;
        m.f(key, "key");
        this.f28889k.putInt(key, i11);
    }

    public g(Bundle bundle, d dVar) {
        m.f(dVar, xTCJ.XDhfiaBCtaUVYj);
        this.f28889k = bundle;
        this.f28890l = dVar;
        this.m = BuildConfig.VERSION_NAME;
        this.f28891n = dVar.f28881a;
    }

    @Override // ub.a, f00.d
    public final void e() {
        String str = kHfjNGauVgdF.rjXiDo;
        Bundle bundle = this.f28889k;
        m.f(bundle, str);
        String key = this.m;
        m.f(key, "key");
        bundle.putString(key, null);
    }

    @Override // ub.a, f00.d
    public final void r(char c11) {
        Bundle source = this.f28889k;
        m.f(source, "source");
        String str = this.m;
        m.f(str, OCBJEWZHh.lmmSs);
        source.putChar(str, c11);
    }

    @Override // ub.a, f00.d
    public final void y(c00.a serializer, Object obj) {
        m.f(serializer, "serializer");
        e00.g descriptor = serializer.getDescriptor();
        if (m.a(descriptor, c.f28866a)) {
            ha.c cVar = ha.c.f32133a;
            m.d(obj, xItStCyvVEZ.lkvsvzqkbsGihKc);
            ha.c.b(this, (CharSequence) obj);
            return;
        }
        if (m.a(descriptor, c.f28867b)) {
            ha.e eVar = ha.e.f32136c;
            m.d(obj, "null cannot be cast to non-null type android.os.Parcelable");
            eVar.c(this, (Parcelable) obj);
            return;
        }
        if (m.a(descriptor, c.f28868c)) {
            ha.d dVar = ha.d.f32135c;
            m.d(obj, "null cannot be cast to non-null type java.io.Serializable");
            dVar.d(this, (Serializable) obj);
            return;
        }
        if (m.a(descriptor, c.f28869d)) {
            e00.h hVar = ha.f.f32137a;
            m.d(obj, "null cannot be cast to non-null type android.os.IBinder");
            IBinder value = (IBinder) obj;
            m.f(value, "value");
            if (!(this instanceof g)) {
                throw new IllegalArgumentException(hz.b.w(ha.f.f32137a.f24682a, this).toString());
            }
            String key = this.m;
            m.f(key, "key");
            this.f28889k.putBinder(key, value);
            return;
        }
        if (m.a(descriptor, c.f28874i) || m.a(descriptor, c.f28875j)) {
            e00.h hVar2 = ha.a.f32130a;
            m.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
            CharSequence[] value2 = (CharSequence[]) obj;
            m.f(value2, "value");
            if (!(this instanceof g)) {
                throw new IllegalArgumentException(hz.b.w(ha.a.f32130a.f24682a, this).toString());
            }
            String key2 = this.m;
            m.f(key2, "key");
            this.f28889k.putCharSequenceArray(key2, value2);
            return;
        }
        if (m.a(descriptor, c.f28876k) || m.a(descriptor, c.f28877l)) {
            ha.b bVar = ha.b.f32131a;
            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.CharSequence>");
            bVar.serialize(this, (List) obj);
            return;
        }
        if (m.a(descriptor, c.f28870e) || m.a(descriptor, c.f28871f)) {
            e00.h hVar3 = ha.h.f32140a;
            m.d(obj, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
            Parcelable[] value3 = (Parcelable[]) obj;
            m.f(value3, "value");
            if (!(this instanceof g)) {
                throw new IllegalArgumentException(hz.b.w(ha.h.f32140a.f24682a, this).toString());
            }
            String key3 = this.m;
            m.f(key3, "key");
            this.f28889k.putParcelableArray(key3, value3);
            return;
        }
        if (m.a(descriptor, c.f28872g) || m.a(descriptor, c.f28873h)) {
            i iVar = i.f32141a;
            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<android.os.Parcelable>");
            iVar.serialize(this, (List) obj);
            return;
        }
        if (m.a(descriptor, c.m) || m.a(descriptor, c.f28878n) || m.a(descriptor, c.f28879o)) {
            q qVar = q.f32156a;
            m.d(obj, "null cannot be cast to non-null type android.util.SparseArray<android.os.Parcelable>");
            qVar.serialize(this, (SparseArray) obj);
            return;
        }
        e00.g descriptor2 = serializer.getDescriptor();
        boolean zA = m.a(descriptor2, b.f28857a);
        Bundle bundle = this.f28889k;
        if (zA) {
            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
            String key4 = this.m;
            m.f(key4, "key");
            bundle.putIntegerArrayList(key4, ew.a.J((List) obj));
            return;
        }
        if (m.a(descriptor2, b.f28858b)) {
            m.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            ef.e.y(bundle, this.m, (List) obj);
            return;
        }
        if (m.a(descriptor2, b.f28859c)) {
            m.d(obj, "null cannot be cast to non-null type kotlin.BooleanArray");
            String key5 = this.m;
            m.f(key5, "key");
            bundle.putBooleanArray(key5, (boolean[]) obj);
            return;
        }
        if (m.a(descriptor2, b.f28860d)) {
            m.d(obj, "null cannot be cast to non-null type kotlin.CharArray");
            String key6 = this.m;
            m.f(key6, "key");
            bundle.putCharArray(key6, (char[]) obj);
            return;
        }
        if (m.a(descriptor2, b.f28861e)) {
            m.d(obj, "null cannot be cast to non-null type kotlin.DoubleArray");
            String key7 = this.m;
            m.f(key7, "key");
            bundle.putDoubleArray(key7, (double[]) obj);
            return;
        }
        if (m.a(descriptor2, b.f28862f)) {
            m.d(obj, "null cannot be cast to non-null type kotlin.FloatArray");
            String key8 = this.m;
            m.f(key8, "key");
            bundle.putFloatArray(key8, (float[]) obj);
            return;
        }
        if (m.a(descriptor2, b.f28863g)) {
            m.d(obj, "null cannot be cast to non-null type kotlin.IntArray");
            String key9 = this.m;
            m.f(key9, "key");
            bundle.putIntArray(key9, (int[]) obj);
            return;
        }
        if (m.a(descriptor2, b.f28864h)) {
            m.d(obj, "null cannot be cast to non-null type kotlin.LongArray");
            String key10 = this.m;
            m.f(key10, "key");
            bundle.putLongArray(key10, (long[]) obj);
            return;
        }
        if (!m.a(descriptor2, b.f28865i)) {
            serializer.serialize(this, obj);
            return;
        }
        m.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        String key11 = this.m;
        m.f(key11, "key");
        bundle.putStringArray(key11, (String[]) obj);
    }
}
