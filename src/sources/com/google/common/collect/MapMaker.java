package com.google.common.collect;

import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import dl.ExOZ.xItStCyvVEZ;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class MapMaker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16972b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16973c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MapMakerInternalMap.Strength f16974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MapMakerInternalMap.Strength f16975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Equivalence f16976f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Dummy {
        private static final /* synthetic */ Dummy[] $VALUES;
        public static final Dummy VALUE;

        static {
            Dummy dummy = new Dummy("VALUE", 0);
            VALUE = dummy;
            $VALUES = new Dummy[]{dummy};
        }

        public static Dummy valueOf(String str) {
            return (Dummy) Enum.valueOf(Dummy.class, str);
        }

        public static Dummy[] values() {
            return (Dummy[]) $VALUES.clone();
        }
    }

    public final ConcurrentMap a() {
        if (!this.f16971a) {
            int i11 = this.f16972b;
            if (i11 == -1) {
                i11 = 16;
            }
            int i12 = this.f16973c;
            if (i12 == -1) {
                i12 = 4;
            }
            return new ConcurrentHashMap(i11, 0.75f, i12);
        }
        MapMakerInternalMap.AnonymousClass1 anonymousClass1 = MapMakerInternalMap.L;
        MapMakerInternalMap.Strength strength = this.f16974d;
        MapMakerInternalMap.Strength strength2 = MapMakerInternalMap.Strength.STRONG;
        if (((MapMakerInternalMap.Strength) MoreObjects.a(strength, strength2)) == strength2 && ((MapMakerInternalMap.Strength) MoreObjects.a(this.f16975e, strength2)) == strength2) {
            return new MapMakerInternalMap(this, MapMakerInternalMap.StrongKeyStrongValueEntry.Helper.f17010a);
        }
        if (((MapMakerInternalMap.Strength) MoreObjects.a(this.f16974d, strength2)) == strength2 && ((MapMakerInternalMap.Strength) MoreObjects.a(this.f16975e, strength2)) == MapMakerInternalMap.Strength.WEAK) {
            return new MapMakerInternalMap(this, MapMakerInternalMap.StrongKeyWeakValueEntry.Helper.f17013a);
        }
        MapMakerInternalMap.Strength strength3 = (MapMakerInternalMap.Strength) MoreObjects.a(this.f16974d, strength2);
        MapMakerInternalMap.Strength strength4 = MapMakerInternalMap.Strength.WEAK;
        if (strength3 == strength4 && ((MapMakerInternalMap.Strength) MoreObjects.a(this.f16975e, strength2)) == strength2) {
            return new MapMakerInternalMap(this, MapMakerInternalMap.WeakKeyStrongValueEntry.Helper.f17018a);
        }
        if (((MapMakerInternalMap.Strength) MoreObjects.a(this.f16974d, strength2)) == strength4 && ((MapMakerInternalMap.Strength) MoreObjects.a(this.f16975e, strength2)) == strength4) {
            return new MapMakerInternalMap(this, MapMakerInternalMap.WeakKeyWeakValueEntry.Helper.f17021a);
        }
        throw new AssertionError();
    }

    public final void c() {
        b(MapMakerInternalMap.Strength.WEAK);
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        int i11 = this.f16972b;
        if (i11 != -1) {
            toStringHelperB.a(i11, "initialCapacity");
        }
        int i12 = this.f16973c;
        if (i12 != -1) {
            toStringHelperB.a(i12, "concurrencyLevel");
        }
        MapMakerInternalMap.Strength strength = this.f16974d;
        if (strength != null) {
            toStringHelperB.c(Ascii.c(strength.toString()), "keyStrength");
        }
        MapMakerInternalMap.Strength strength2 = this.f16975e;
        if (strength2 != null) {
            toStringHelperB.c(Ascii.c(strength2.toString()), "valueStrength");
        }
        if (this.f16976f != null) {
            toStringHelperB.f("keyEquivalence");
        }
        return toStringHelperB.toString();
    }

    public final void b(MapMakerInternalMap.Strength strength) {
        MapMakerInternalMap.Strength strength2 = this.f16974d;
        Preconditions.q(xItStCyvVEZ.SkoqymU, strength2 == null, strength2);
        strength.getClass();
        this.f16974d = strength;
        if (strength != MapMakerInternalMap.Strength.STRONG) {
            this.f16971a = true;
        }
    }
}
