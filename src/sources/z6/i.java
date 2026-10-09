package z6;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f58973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f58974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f58975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f58976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f58977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f58978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f58979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f58980i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f58981j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ByteBuffer f58982k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ShortBuffer f58983l;
    public ByteBuffer m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f58984n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f58985o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f58986p;

    @Override // z6.f
    public final boolean a() {
        if (this.f58986p) {
            h hVar = this.f58981j;
            if (hVar != null) {
                b7.a.j(hVar.m >= 0);
                if (hVar.m * hVar.f58952b * 2 == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // z6.f
    public final ByteBuffer b() {
        h hVar = this.f58981j;
        if (hVar != null) {
            int i11 = hVar.f58952b;
            b7.a.j(hVar.m >= 0);
            int i12 = hVar.m * i11 * 2;
            if (i12 > 0) {
                if (this.f58982k.capacity() < i12) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i12).order(ByteOrder.nativeOrder());
                    this.f58982k = byteBufferOrder;
                    this.f58983l = byteBufferOrder.asShortBuffer();
                } else {
                    this.f58982k.clear();
                    this.f58983l.clear();
                }
                ShortBuffer shortBuffer = this.f58983l;
                b7.a.j(hVar.m >= 0);
                int iMin = Math.min(shortBuffer.remaining() / i11, hVar.m);
                int i13 = iMin * i11;
                shortBuffer.put(hVar.f58962l, 0, i13);
                int i14 = hVar.m - iMin;
                hVar.m = i14;
                short[] sArr = hVar.f58962l;
                System.arraycopy(sArr, i13, sArr, 0, i14 * i11);
                this.f58985o += (long) i12;
                this.f58982k.limit(i12);
                this.m = this.f58982k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = f.f58943a;
        return byteBuffer;
    }

    @Override // z6.f
    public final void c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            h hVar = this.f58981j;
            hVar.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f58984n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i11 = hVar.f58952b;
            int i12 = iRemaining2 / i11;
            short[] sArrC = hVar.c(hVar.f58960j, hVar.f58961k, i12);
            hVar.f58960j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, hVar.f58961k * i11, ((i12 * i11) * 2) / 2);
            hVar.f58961k += i12;
            hVar.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // z6.f
    public final void d() {
        h hVar = this.f58981j;
        if (hVar != null) {
            int i11 = hVar.f58961k;
            float f5 = hVar.f58953c;
            float f11 = hVar.f58954d;
            double d5 = f5 / f11;
            double d11 = hVar.f58955e * f11;
            int i12 = hVar.f58967r;
            int i13 = hVar.m + ((int) ((((((((double) (i11 - i12)) / d5) + ((double) i12)) + hVar.f58972w) + ((double) hVar.f58964o)) / d11) + 0.5d));
            hVar.f58972w = 0.0d;
            short[] sArr = hVar.f58960j;
            int i14 = hVar.f58958h * 2;
            hVar.f58960j = hVar.c(sArr, i11, i14 + i11);
            int i15 = 0;
            while (true) {
                int i16 = hVar.f58952b;
                if (i15 >= i14 * i16) {
                    break;
                }
                hVar.f58960j[(i16 * i11) + i15] = 0;
                i15++;
            }
            hVar.f58961k = i14 + hVar.f58961k;
            hVar.f();
            if (hVar.m > i13) {
                hVar.m = Math.max(i13, 0);
            }
            hVar.f58961k = 0;
            hVar.f58967r = 0;
            hVar.f58964o = 0;
        }
        this.f58986p = true;
    }

    @Override // z6.f
    public final e e(e eVar) throws AudioProcessor$UnhandledAudioFormatException {
        if (eVar.f58941c != 2) {
            throw new AudioProcessor$UnhandledAudioFormatException(eVar);
        }
        int i11 = this.f58973b;
        if (i11 == -1) {
            i11 = eVar.f58939a;
        }
        this.f58976e = eVar;
        e eVar2 = new e(i11, eVar.f58940b, 2);
        this.f58977f = eVar2;
        this.f58980i = true;
        return eVar2;
    }

    @Override // z6.f
    public final void flush() {
        if (isActive()) {
            e eVar = this.f58976e;
            this.f58978g = eVar;
            e eVar2 = this.f58977f;
            this.f58979h = eVar2;
            if (this.f58980i) {
                this.f58981j = new h(eVar.f58939a, eVar.f58940b, this.f58974c, this.f58975d, eVar2.f58939a);
            } else {
                h hVar = this.f58981j;
                if (hVar != null) {
                    hVar.f58961k = 0;
                    hVar.m = 0;
                    hVar.f58964o = 0;
                    hVar.f58965p = 0;
                    hVar.f58966q = 0;
                    hVar.f58967r = 0;
                    hVar.f58968s = 0;
                    hVar.f58969t = 0;
                    hVar.f58970u = 0;
                    hVar.f58971v = 0;
                    hVar.f58972w = 0.0d;
                }
            }
        }
        this.m = f.f58943a;
        this.f58984n = 0L;
        this.f58985o = 0L;
        this.f58986p = false;
    }

    @Override // z6.f
    public final boolean isActive() {
        if (this.f58977f.f58939a != -1) {
            return Math.abs(this.f58974c - 1.0f) >= 1.0E-4f || Math.abs(this.f58975d - 1.0f) >= 1.0E-4f || this.f58977f.f58939a != this.f58976e.f58939a;
        }
        return false;
    }

    @Override // z6.f
    public final void reset() {
        this.f58974c = 1.0f;
        this.f58975d = 1.0f;
        e eVar = e.f58938e;
        this.f58976e = eVar;
        this.f58977f = eVar;
        this.f58978g = eVar;
        this.f58979h = eVar;
        ByteBuffer byteBuffer = f.f58943a;
        this.f58982k = byteBuffer;
        this.f58983l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.f58973b = -1;
        this.f58980i = false;
        this.f58981j = null;
        this.f58984n = 0L;
        this.f58985o = 0L;
        this.f58986p = false;
    }
}
