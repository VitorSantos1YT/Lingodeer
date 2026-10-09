package ef;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f25523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f25524c;

    public m(String uriStr, File file, l lVar) {
        kotlin.jvm.internal.m.f(uriStr, "uriStr");
        this.f25522a = uriStr;
        this.f25523b = file;
        this.f25524c = lVar;
    }

    public final Boolean a(String... args) {
        if (qf.a.b(this)) {
            return null;
        }
        try {
            kotlin.jvm.internal.m.f(args, "args");
            try {
                URL url = new URL(this.f25522a);
                int contentLength = url.openConnection().getContentLength();
                DataInputStream dataInputStream = new DataInputStream(url.openStream());
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f25523b));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (qf.a.b(this)) {
            return null;
        }
        try {
            return a((String[]) objArr);
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (!qf.a.b(this) && zBooleanValue) {
                try {
                    this.f25524c.e(this.f25523b);
                } catch (Throwable th2) {
                    qf.a.a(this, th2);
                }
            }
        } catch (Throwable th3) {
            qf.a.a(this, th3);
        }
    }
}
