package ag;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m00.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f701b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f700a = i11;
        this.f701b = obj;
    }

    public String a() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f701b;
        boolean z11 = false;
        try {
            if (httpURLConnection.getResponseCode() / 100 == 2) {
                z11 = true;
            }
        } catch (IOException unused) {
        }
        if (z11) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to fetch ");
            sb2.append(httpURLConnection.getURL());
            sb2.append(". Failed with ");
            sb2.append(httpURLConnection.getResponseCode());
            sb2.append("\n");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
            StringBuilder sb3 = new StringBuilder();
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb3.append(line);
                        sb3.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused2) {
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                    throw th2;
                }
            }
            bufferedReader.close();
            sb2.append(sb3.toString());
            return sb2.toString();
        } catch (IOException e8) {
            kd.d.c("get error failed ", e8);
            return e8.getMessage();
        }
    }

    public List b() throws IOException {
        b bVar;
        long j11;
        long j12;
        long j13;
        a aVar;
        e eVar;
        FileChannel fileChannel = (FileChannel) this.f701b;
        long j14 = 0;
        fileChannel.position(0L);
        ArrayList arrayList = new ArrayList();
        fileChannel.position(0L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferAllocate.order(byteOrder);
        if (e(byteBufferAllocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        c(byteBufferAllocate, 4L, 1);
        short s3 = (short) (byteBufferAllocate.get() & 255);
        long j15 = 5;
        c(byteBufferAllocate, 5L, 1);
        boolean z11 = ((short) (byteBufferAllocate.get() & 255)) == 2;
        if (s3 == 1) {
            bVar = new b(z11, this, 0);
        } else {
            if (s3 != 2) {
                throw new IllegalStateException("Invalid class type!");
            }
            bVar = new b(z11, this, 1);
        }
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(8);
        if (bVar.f693a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        byteBufferAllocate2.order(byteOrder);
        long j16 = bVar.f697e;
        if (j16 == 65535) {
            switch (bVar.f698f) {
                case 0:
                    eVar = new e();
                    ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(4);
                    byteBufferAllocate3.order(bVar.f693a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                    eVar.f706a = bVar.f699g.e(byteBufferAllocate3, bVar.f695c + ((long) 0) + 28);
                    break;
                default:
                    eVar = new e();
                    ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(8);
                    byteBufferAllocate4.order(bVar.f693a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                    eVar.f706a = bVar.f699g.e(byteBufferAllocate4, bVar.f695c + ((long) 0) + 44);
                    break;
            }
            j16 = eVar.f706a;
        }
        long j17 = 0;
        while (true) {
            j11 = 1;
            if (j17 < j16) {
                d dVarA = bVar.a(j17);
                j12 = j14;
                if (dVarA.f702a == 2) {
                    j14 = dVarA.f703b;
                } else {
                    j17++;
                    j14 = j12;
                }
            } else {
                j12 = j14;
            }
        }
        if (j14 == j12) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j18 = j12;
        int i11 = 0;
        while (true) {
            switch (bVar.f698f) {
                case 0:
                    j13 = j14;
                    aVar = new a();
                    ByteBuffer byteBufferAllocate5 = ByteBuffer.allocate(4);
                    byteBufferAllocate5.order(bVar.f693a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                    long j19 = j13 + ((long) (i11 * 8));
                    c cVar = bVar.f699g;
                    aVar.f691a = cVar.e(byteBufferAllocate5, j19);
                    aVar.f692b = cVar.e(byteBufferAllocate5, j19 + 4);
                    break;
                default:
                    aVar = new a();
                    ByteBuffer byteBufferAllocate6 = ByteBuffer.allocate(8);
                    byteBufferAllocate6.order(bVar.f693a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
                    long j21 = ((long) (i11 * 16)) + j14;
                    c cVar2 = bVar.f699g;
                    cVar2.c(byteBufferAllocate6, j21, 8);
                    j13 = j14;
                    aVar.f691a = byteBufferAllocate6.getLong();
                    cVar2.c(byteBufferAllocate6, j21 + 8, 8);
                    aVar.f692b = byteBufferAllocate6.getLong();
                    break;
            }
            long j22 = aVar.f691a;
            if (j22 == j11) {
                arrayList2.add(Long.valueOf(aVar.f692b));
            } else if (j22 == j15) {
                j18 = aVar.f692b;
            }
            i11++;
            if (aVar.f691a == j12) {
                if (j18 == j12) {
                    throw new IllegalStateException("String table offset not found!");
                }
                for (long j23 = j12; j23 < j16; j23 += j11) {
                    d dVarA2 = bVar.a(j23);
                    if (dVarA2.f702a == j11) {
                        long j24 = dVarA2.f704c;
                        if (j24 <= j18 && j18 <= dVarA2.f705d + j24) {
                            long j25 = (j18 - j24) + dVarA2.f703b;
                            int size = arrayList2.size();
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj = arrayList2.get(i12);
                                i12++;
                                long jLongValue = ((Long) obj).longValue() + j25;
                                StringBuilder sb2 = new StringBuilder();
                                while (true) {
                                    long j26 = jLongValue + j11;
                                    c(byteBufferAllocate2, jLongValue, 1);
                                    short s11 = (short) (byteBufferAllocate2.get() & 255);
                                    if (s11 != 0) {
                                        sb2.append((char) s11);
                                        jLongValue = j26;
                                    }
                                }
                                arrayList.add(sb2.toString());
                            }
                            return arrayList;
                        }
                    }
                }
                throw new IllegalStateException("Could not map vma to file offset!");
            }
            j15 = j15;
            j11 = j11;
            j14 = j13;
        }
    }

    public void c(ByteBuffer byteBuffer, long j11, int i11) {
        byteBuffer.position(0);
        byteBuffer.limit(i11);
        long j12 = 0;
        while (j12 < i11) {
            int i12 = ((FileChannel) this.f701b).read(byteBuffer, j11 + j12);
            if (i12 == -1) {
                throw new EOFException();
            }
            j12 += (long) i12;
        }
        byteBuffer.position(0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f700a) {
            case 0:
                ((FileChannel) this.f701b).close();
                return;
            case 1:
                ((HttpURLConnection) this.f701b).disconnect();
                return;
            case 2:
                if (((i) this.f701b) == null) {
                    throw new IllegalStateException("not attached to a buffer");
                }
                this.f701b = null;
                return;
            default:
                ((yb.c) this.f701b).close();
                return;
        }
    }

    public int d(ByteBuffer byteBuffer, long j11) {
        c(byteBuffer, j11, 2);
        return byteBuffer.getShort() & 65535;
    }

    public long e(ByteBuffer byteBuffer, long j11) {
        c(byteBuffer, j11, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    public c(File file) {
        this.f700a = 0;
        if (!file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f701b = new FileInputStream(file).getChannel();
    }

    public c() {
        this.f700a = 2;
    }
}
