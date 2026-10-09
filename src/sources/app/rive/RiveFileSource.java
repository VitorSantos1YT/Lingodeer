package app.rive;

import java.util.Arrays;
import kotlin.jvm.internal.m;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface RiveFileSource {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Bytes implements RiveFileSource {
        private final byte[] data;

        private /* synthetic */ Bytes(byte[] bArr) {
            this.data = bArr;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Bytes m24boximpl(byte[] bArr) {
            return new Bytes(bArr);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static byte[] m25constructorimpl(byte[] data) {
            m.f(data, "data");
            return data;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m26equalsimpl(byte[] bArr, Object obj) {
            return (obj instanceof Bytes) && m.a(bArr, ((Bytes) obj).m30unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m27equalsimpl0(byte[] bArr, byte[] bArr2) {
            return m.a(bArr, bArr2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m28hashCodeimpl(byte[] bArr) {
            return Arrays.hashCode(bArr);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m29toStringimpl(byte[] bArr) {
            return "Bytes(data=" + Arrays.toString(bArr) + ')';
        }

        public boolean equals(Object obj) {
            return m26equalsimpl(this.data, obj);
        }

        public final byte[] getData() {
            return this.data;
        }

        public int hashCode() {
            return m28hashCodeimpl(this.data);
        }

        public String toString() {
            return m29toStringimpl(this.data);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ byte[] m30unboximpl() {
            return this.data;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class RawRes implements RiveFileSource {
        private final int resId;

        private /* synthetic */ RawRes(int i11) {
            this.resId = i11;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ RawRes m31boximpl(int i11) {
            return new RawRes(i11);
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m33equalsimpl(int i11, Object obj) {
            return (obj instanceof RawRes) && i11 == ((RawRes) obj).m37unboximpl();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m34equalsimpl0(int i11, int i12) {
            return i11 == i12;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m35hashCodeimpl(int i11) {
            return Integer.hashCode(i11);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m36toStringimpl(int i11) {
            return p.o("RawRes(resId=", i11, ')');
        }

        public boolean equals(Object obj) {
            return m33equalsimpl(this.resId, obj);
        }

        public final int getResId() {
            return this.resId;
        }

        public int hashCode() {
            return m35hashCodeimpl(this.resId);
        }

        public String toString() {
            return m36toStringimpl(this.resId);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m37unboximpl() {
            return this.resId;
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m32constructorimpl(int i11) {
            return i11;
        }
    }
}
