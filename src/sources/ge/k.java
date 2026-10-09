package ge;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import gb.r;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import m0.n;
import td.l;
import vd.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f29171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f29172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f29173c;

    public k(ArrayList arrayList, b bVar, n nVar) {
        this.f29171a = arrayList;
        this.f29172b = bVar;
        this.f29173c = nVar;
    }

    @Override // td.l
    public final b0 a(Object obj, int i11, int i12, td.j jVar) {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i13 = inputStream.read(bArr);
                if (i13 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i13);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f29172b.a(ByteBuffer.wrap(byteArray), i11, i12, jVar);
    }

    @Override // td.l
    public final boolean b(Object obj, td.j jVar) {
        return !((Boolean) jVar.c(j.f29170b)).booleanValue() && r.w(this.f29171a, (InputStream) obj, this.f29173c) == ImageHeaderParser$ImageType.GIF;
    }
}
