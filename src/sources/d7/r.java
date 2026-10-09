package d7;

import android.net.Uri;
import androidx.media3.datasource.UdpDataSource$UdpDataSourceException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends b {
    public Uri H;
    public DatagramSocket K;
    public MulticastSocket L;
    public InetAddress M;
    public boolean N;
    public int O;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f23258f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DatagramPacket f23259t;

    public r() {
        super(true);
        this.f23257e = 8000;
        byte[] bArr = new byte[2000];
        this.f23258f = bArr;
        this.f23259t = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // d7.f
    public final void close() {
        this.H = null;
        MulticastSocket multicastSocket = this.L;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.M;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.L = null;
        }
        DatagramSocket datagramSocket = this.K;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.K = null;
        }
        this.M = null;
        this.O = 0;
        if (this.N) {
            this.N = false;
            e();
        }
    }

    @Override // y6.h
    public final int read(byte[] bArr, int i11, int i12) throws UdpDataSource$UdpDataSourceException {
        if (i12 == 0) {
            return 0;
        }
        int i13 = this.O;
        DatagramPacket datagramPacket = this.f23259t;
        if (i13 == 0) {
            try {
                DatagramSocket datagramSocket = this.K;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.O = length;
                b(length);
            } catch (SocketTimeoutException e8) {
                throw new UdpDataSource$UdpDataSourceException(e8, 2002);
            } catch (IOException e10) {
                throw new UdpDataSource$UdpDataSourceException(e10, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i14 = this.O;
        int iMin = Math.min(i14, i12);
        System.arraycopy(this.f23258f, length2 - i14, bArr, i11, iMin);
        this.O -= iMin;
        return iMin;
    }

    @Override // d7.f
    public final long u(h hVar) throws UdpDataSource$UdpDataSourceException {
        Uri uri = hVar.f23224a;
        this.H = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.H.getPort();
        g();
        try {
            this.M = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.M, port);
            if (this.M.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.L = multicastSocket;
                multicastSocket.joinGroup(this.M);
                this.K = this.L;
            } else {
                this.K = new DatagramSocket(inetSocketAddress);
            }
            this.K.setSoTimeout(this.f23257e);
            this.N = true;
            h(hVar);
            return -1L;
        } catch (IOException e8) {
            throw new UdpDataSource$UdpDataSourceException(e8, 2001);
        } catch (SecurityException e10) {
            throw new UdpDataSource$UdpDataSourceException(e10, 2006);
        }
    }

    @Override // d7.f
    public final Uri x() {
        return this.H;
    }
}
