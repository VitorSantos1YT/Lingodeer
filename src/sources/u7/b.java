package u7;

import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f52814a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f52815b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f52816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f52817d;

    public static long a() {
        byte[] bArr;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            Object obj = f52815b;
            synchronized (obj) {
            }
            datagramSocket.setSoTimeout(1000);
            synchronized (obj) {
            }
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b3 = 0;
            SocketTimeoutException socketTimeoutException = null;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i11], 123);
                bArr2[b3] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jCurrentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b3);
                    bArr = bArr2;
                } else {
                    long j11 = jCurrentTimeMillis / 1000;
                    long j12 = jCurrentTimeMillis - (j11 * 1000);
                    long j13 = j11 + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j13 >> 24);
                    bArr[41] = (byte) (j13 >> 16);
                    bArr[42] = (byte) (j13 >> 8);
                    bArr[43] = (byte) j13;
                    long j14 = (j12 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j14 >> 24);
                    bArr[45] = (byte) (j14 >> 16);
                    bArr[46] = (byte) (j14 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j15 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
                    byte b11 = bArr3[b3];
                    int i13 = bArr3[1] & 255;
                    long jD = d(bArr3, 24);
                    long jD2 = d(bArr3, 32);
                    long jD3 = d(bArr3, 40);
                    b((byte) ((b11 >> 6) & 3), (byte) (b11 & 7), i13, jD3);
                    long j16 = (j15 + (((jD3 - j15) + (jD2 - jD)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j16;
                } catch (SocketTimeoutException e8) {
                    if (socketTimeoutException == 0) {
                        socketTimeoutException = e8;
                    } else {
                        SocketTimeoutException socketTimeoutException2 = socketTimeoutException;
                        socketTimeoutException2.addSuppressed(e8);
                        socketTimeoutException = socketTimeoutException2;
                    }
                    int i14 = i12 + 1;
                    if (i12 >= 10) {
                        socketTimeoutException.getClass();
                        throw socketTimeoutException;
                    }
                    i11++;
                    i12 = i14;
                    b3 = b3;
                }
            }
            socketTimeoutException.getClass();
            throw socketTimeoutException;
        } catch (Throwable th2) {
            try {
                datagramSocket.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public static void b(byte b3, byte b11, int i11, long j11) throws IOException {
        if (b3 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            throw new IOException(p.j(b11, "SNTP: Untrusted mode: "));
        }
        if (i11 == 0 || i11 > 15) {
            throw new IOException(p.j(i11, "SNTP: Untrusted stratum: "));
        }
        if (j11 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static long c(byte[] bArr, int i11) {
        int i12 = bArr[i11];
        int i13 = bArr[i11 + 1];
        int i14 = bArr[i11 + 2];
        int i15 = bArr[i11 + 3];
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        if ((i15 & 128) == 128) {
            i15 = (i15 & 127) + 128;
        }
        return (((long) i12) << 24) + (((long) i13) << 16) + (((long) i14) << 8) + ((long) i15);
    }

    public static long d(byte[] bArr, int i11) {
        long jC = c(bArr, i11);
        long jC2 = c(bArr, i11 + 4);
        if (jC == 0 && jC2 == 0) {
            return 0L;
        }
        return ((jC2 * 1000) / 4294967296L) + ((jC - 2208988800L) * 1000);
    }
}
