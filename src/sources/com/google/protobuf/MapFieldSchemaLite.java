package com.google.protobuf;

import com.google.android.material.datepicker.d;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
class MapFieldSchemaLite implements MapFieldSchema {
    @Override // com.google.protobuf.MapFieldSchema
    public final MapFieldLite a(Object obj, Object obj2) {
        MapFieldLite mapFieldLiteD = (MapFieldLite) obj;
        MapFieldLite mapFieldLite = (MapFieldLite) obj2;
        if (!mapFieldLite.isEmpty()) {
            if (!mapFieldLiteD.f21318a) {
                mapFieldLiteD = mapFieldLiteD.d();
            }
            mapFieldLiteD.c();
            if (!mapFieldLite.isEmpty()) {
                mapFieldLiteD.putAll(mapFieldLite);
            }
        }
        return mapFieldLiteD;
    }

    @Override // com.google.protobuf.MapFieldSchema
    public final Object b(Object obj) {
        ((MapFieldLite) obj).f21318a = false;
        return obj;
    }

    @Override // com.google.protobuf.MapFieldSchema
    public final MapEntryLite.Metadata c(Object obj) {
        return ((MapEntryLite) obj).f21311a;
    }

    @Override // com.google.protobuf.MapFieldSchema
    public final MapFieldLite d() {
        return MapFieldLite.f21317b.d();
    }

    @Override // com.google.protobuf.MapFieldSchema
    public final MapFieldLite e(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // com.google.protobuf.MapFieldSchema
    public final int f(int i11, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapEntryLite mapEntryLite = (MapEntryLite) obj2;
        int iB = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : mapFieldLite.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            mapEntryLite.getClass();
            int iV = CodedOutputStream.V(i11);
            int iA = MapEntryLite.a(mapEntryLite.f21311a, key, value);
            iB = d.b(iA, iA, iV, iB);
        }
        return iB;
    }

    @Override // com.google.protobuf.MapFieldSchema
    public final boolean g(Object obj) {
        return !((MapFieldLite) obj).f21318a;
    }

    @Override // com.google.protobuf.MapFieldSchema
    public final MapFieldLite h(Object obj) {
        return (MapFieldLite) obj;
    }
}
