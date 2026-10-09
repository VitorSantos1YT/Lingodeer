package ga;

import android.os.Bundle;
import android.os.Parcelable;
import com.android.billingclient.api.h;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ha.i;
import ha.q;
import java.util.Arrays;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import se.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f28884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f28885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f28886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f28888e;

    public f(Bundle bundle, d configuration) {
        m.f(configuration, "configuration");
        this.f28884a = bundle;
        this.f28885b = configuration;
        this.f28886c = BuildConfig.VERSION_NAME;
        this.f28888e = configuration.f28881a;
    }

    @Override // se.p, f00.c
    public final byte A() {
        Bundle source = this.f28884a;
        m.f(source, "source");
        return (byte) com.bumptech.glide.f.t(this.f28886c, source);
    }

    @Override // se.p, f00.c
    public final short B() {
        Bundle source = this.f28884a;
        m.f(source, "source");
        return (short) com.bumptech.glide.f.t(this.f28886c, source);
    }

    @Override // se.p, f00.c
    public final float C() {
        String key = this.f28886c;
        m.f(key, "key");
        Bundle bundle = this.f28884a;
        float f5 = bundle.getFloat(key, Float.MIN_VALUE);
        if (f5 != Float.MIN_VALUE || bundle.getFloat(key, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return f5;
        }
        com.bumptech.glide.g.r(key);
        throw null;
    }

    @Override // se.p, f00.c
    public final double E() {
        String key = this.f28886c;
        m.f(key, "key");
        Bundle bundle = this.f28884a;
        double d5 = bundle.getDouble(key, Double.MIN_VALUE);
        if (d5 != Double.MIN_VALUE || bundle.getDouble(key, Double.MAX_VALUE) != Double.MAX_VALUE) {
            return d5;
        }
        com.bumptech.glide.g.r(key);
        throw null;
    }

    @Override // f00.a
    public final h a() {
        return this.f28888e;
    }

    @Override // se.p, f00.c
    public final f00.a d(e00.g descriptor) {
        m.f(descriptor, "descriptor");
        if (m.a(this.f28886c, BuildConfig.VERSION_NAME)) {
            return this;
        }
        Bundle source = this.f28884a;
        m.f(source, "source");
        return new f(com.bumptech.glide.f.v(this.f28886c, source), this.f28885b);
    }

    @Override // se.p, f00.c
    public final boolean f() {
        String key = this.f28886c;
        m.f(key, "key");
        Bundle bundle = this.f28884a;
        boolean z11 = bundle.getBoolean(key, false);
        if (z11 || !bundle.getBoolean(key, true)) {
            return z11;
        }
        com.bumptech.glide.g.r(key);
        throw null;
    }

    @Override // se.p, f00.c
    public final char g() {
        String key = this.f28886c;
        m.f(key, "key");
        Bundle bundle = this.f28884a;
        char c11 = bundle.getChar(key, (char) 0);
        if (c11 != 0 || bundle.getChar(key, (char) 65535) != 65535) {
            return c11;
        }
        com.bumptech.glide.g.r(key);
        throw null;
    }

    @Override // se.p, f00.c
    public final int j() {
        Bundle source = this.f28884a;
        m.f(source, "source");
        return com.bumptech.glide.f.t(this.f28886c, source);
    }

    @Override // se.p, f00.c
    public final String l() {
        Bundle source = this.f28884a;
        m.f(source, "source");
        return com.bumptech.glide.f.w(this.f28886c, source);
    }

    @Override // f00.a
    public final int n(e00.g descriptor) {
        m.f(descriptor, "descriptor");
        boolean zA = m.a(descriptor.e(), e00.m.f24701d);
        Bundle bundle = this.f28884a;
        int size = (zA || m.a(descriptor.e(), e00.m.f24702e)) ? bundle.size() : descriptor.f();
        while (true) {
            int i11 = this.f28887d;
            if (i11 < size && descriptor.j(i11)) {
                String key = descriptor.g(this.f28887d);
                m.f(key, "key");
                if (bundle.containsKey(key)) {
                    break;
                }
                this.f28887d++;
            } else {
                break;
            }
        }
        int i12 = this.f28887d;
        if (i12 >= size) {
            return -1;
        }
        this.f28886c = descriptor.g(i12);
        int i13 = this.f28887d;
        this.f28887d = i13 + 1;
        return i13;
    }

    @Override // se.p, f00.c
    public final long o() {
        String key = this.f28886c;
        m.f(key, "key");
        Bundle bundle = this.f28884a;
        long j11 = bundle.getLong(key, Long.MIN_VALUE);
        if (j11 != Long.MIN_VALUE || bundle.getLong(key, Long.MAX_VALUE) != Long.MAX_VALUE) {
            return j11;
        }
        com.bumptech.glide.g.r(key);
        throw null;
    }

    @Override // se.p, f00.c
    public final boolean r() {
        Bundle source = this.f28884a;
        m.f(source, "source");
        String key = this.f28886c;
        m.f(key, "key");
        return !(source.containsKey(key) && source.get(key) == null);
    }

    @Override // se.p, f00.c
    public final Object x(c00.a deserializer) {
        Object objA;
        Object stringArray;
        m.f(deserializer, "deserializer");
        e00.g descriptor = deserializer.getDescriptor();
        Object objX = null;
        if (m.a(descriptor, c.f28866a)) {
            ha.c cVar = ha.c.f32133a;
            objA = ha.c.a(this);
        } else if (m.a(descriptor, c.f28867b)) {
            objA = ha.e.f32136c.a(this);
        } else if (m.a(descriptor, c.f28868c)) {
            objA = ha.d.f32135c.b(this);
        } else if (m.a(descriptor, c.f28869d)) {
            objA = ha.f.a(this);
        } else if (m.a(descriptor, c.f28874i) || m.a(descriptor, c.f28875j)) {
            objA = ha.a.a(this);
        } else if (m.a(descriptor, c.f28876k) || m.a(descriptor, c.f28877l)) {
            objA = ha.b.f32131a.deserialize(this);
        } else if (m.a(descriptor, c.f28870e)) {
            Parcelable[] parcelableArrA = ha.h.a(this);
            Object objDeserialize = deserializer.deserialize(a.f28855a);
            m.c(objDeserialize);
            objA = Arrays.copyOf(parcelableArrA, parcelableArrA.length, qx.b.p(z.a(objDeserialize.getClass())));
        } else if (m.a(descriptor, c.f28871f)) {
            objA = ha.h.a(this);
        } else if (m.a(descriptor, c.f28872g) || m.a(descriptor, c.f28873h)) {
            objA = i.f32141a.deserialize(this);
        } else {
            objA = (m.a(descriptor, c.m) || m.a(descriptor, c.f28878n) || m.a(descriptor, c.f28879o)) ? q.f32156a.deserialize(this) : null;
        }
        if (objA == null) {
            e00.g descriptor2 = deserializer.getDescriptor();
            boolean zA = m.a(descriptor2, b.f28857a);
            Bundle bundle = this.f28884a;
            if (zA) {
                String key = this.f28886c;
                m.f(key, "key");
                stringArray = bundle.getIntegerArrayList(key);
                if (stringArray == null) {
                    com.bumptech.glide.g.r(key);
                    throw null;
                }
            } else if (m.a(descriptor2, b.f28858b)) {
                objX = com.bumptech.glide.f.x(this.f28886c, bundle);
            } else if (m.a(descriptor2, b.f28859c)) {
                String key2 = this.f28886c;
                m.f(key2, "key");
                stringArray = bundle.getBooleanArray(key2);
                if (stringArray == null) {
                    com.bumptech.glide.g.r(key2);
                    throw null;
                }
            } else if (m.a(descriptor2, b.f28860d)) {
                String key3 = this.f28886c;
                m.f(key3, "key");
                stringArray = bundle.getCharArray(key3);
                if (stringArray == null) {
                    com.bumptech.glide.g.r(key3);
                    throw null;
                }
            } else if (m.a(descriptor2, b.f28861e)) {
                String key4 = this.f28886c;
                m.f(key4, "key");
                stringArray = bundle.getDoubleArray(key4);
                if (stringArray == null) {
                    com.bumptech.glide.g.r(key4);
                    throw null;
                }
            } else if (m.a(descriptor2, b.f28862f)) {
                String key5 = this.f28886c;
                m.f(key5, "key");
                stringArray = bundle.getFloatArray(key5);
                if (stringArray == null) {
                    com.bumptech.glide.g.r(key5);
                    throw null;
                }
            } else if (m.a(descriptor2, b.f28863g)) {
                String key6 = this.f28886c;
                m.f(key6, "key");
                stringArray = bundle.getIntArray(key6);
                if (stringArray == null) {
                    com.bumptech.glide.g.r(key6);
                    throw null;
                }
            } else if (m.a(descriptor2, b.f28864h)) {
                String key7 = this.f28886c;
                m.f(key7, "key");
                stringArray = bundle.getLongArray(key7);
                if (stringArray == null) {
                    com.bumptech.glide.g.r(key7);
                    throw null;
                }
            } else if (m.a(descriptor2, b.f28865i)) {
                String key8 = this.f28886c;
                m.f(key8, "key");
                stringArray = bundle.getStringArray(key8);
                if (stringArray == null) {
                    com.bumptech.glide.g.r(key8);
                    throw null;
                }
            }
            objX = stringArray;
        } else {
            objX = objA;
        }
        return objX == null ? deserializer.deserialize(this) : objX;
    }

    @Override // se.p, f00.c
    public final int z(e00.g enumDescriptor) {
        m.f(enumDescriptor, "enumDescriptor");
        Bundle source = this.f28884a;
        m.f(source, "source");
        return com.bumptech.glide.f.t(this.f28886c, source);
    }
}
