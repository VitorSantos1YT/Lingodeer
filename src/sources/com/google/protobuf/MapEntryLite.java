package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MapEntryLite<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Metadata f21311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21312b;

    /* JADX INFO: renamed from: com.google.protobuf.MapEntryLite$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21313a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f21313a = iArr;
            try {
                iArr[WireFormat.FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21313a[WireFormat.FieldType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21313a[WireFormat.FieldType.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Metadata<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WireFormat.FieldType f21314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WireFormat.FieldType f21315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f21316c;

        public Metadata(WireFormat.FieldType fieldType, WireFormat.FieldType fieldType2, Object obj) {
            this.f21314a = fieldType;
            this.f21315b = fieldType2;
            this.f21316c = obj;
        }
    }

    public MapEntryLite(WireFormat.FieldType fieldType, WireFormat.FieldType fieldType2, Object obj) {
        this.f21311a = new Metadata(fieldType, fieldType2, obj);
        this.f21312b = obj;
    }

    public static int a(Metadata metadata, Object obj, Object obj2) {
        return FieldSet.b(metadata.f21314a, 1, obj) + FieldSet.b(metadata.f21315b, 2, obj2);
    }

    public static void b(CodedOutputStream codedOutputStream, Metadata metadata, Object obj, Object obj2) {
        FieldSet.n(codedOutputStream, metadata.f21314a, 1, obj);
        FieldSet.n(codedOutputStream, metadata.f21315b, 2, obj2);
    }
}
