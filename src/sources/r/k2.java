package r;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import com.adjust.sdk.Constants;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 implements re.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f48595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f48596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f48597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f48598d;

    public void b(String str, Object... args) throws IOException {
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.f48597c;
        kotlin.jvm.internal.m.f(args, "args");
        if (this.f48596b) {
            Locale locale = Locale.US;
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String strEncode = URLEncoder.encode(String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)), Constants.ENCODING);
            kotlin.jvm.internal.m.e(strEncode, "encode(String.format(Loc… format, *args), \"UTF-8\")");
            byte[] bytes = strEncode.getBytes(oz.a.f46133a);
            kotlin.jvm.internal.m.e(bytes, "this as java.lang.String).getBytes(charset)");
            filterOutputStream.write(bytes);
            return;
        }
        if (this.f48595a) {
            Charset charset = oz.a.f46133a;
            byte[] bytes2 = "--".getBytes(charset);
            kotlin.jvm.internal.m.e(bytes2, "this as java.lang.String).getBytes(charset)");
            filterOutputStream.write(bytes2);
            byte[] bytes3 = re.y.f49225j.getBytes(charset);
            kotlin.jvm.internal.m.e(bytes3, "this as java.lang.String).getBytes(charset)");
            filterOutputStream.write(bytes3);
            byte[] bytes4 = "\r\n".getBytes(charset);
            kotlin.jvm.internal.m.e(bytes4, "this as java.lang.String).getBytes(charset)");
            filterOutputStream.write(bytes4);
            this.f48595a = false;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(args, args.length);
        byte[] bytes5 = String.format(str, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length)).getBytes(oz.a.f46133a);
        kotlin.jvm.internal.m.e(bytes5, "this as java.lang.String).getBytes(charset)");
        filterOutputStream.write(bytes5);
    }

    public void c(String str, String str2, String str3) throws IOException {
        if (this.f48596b) {
            FilterOutputStream filterOutputStream = (FilterOutputStream) this.f48597c;
            byte[] bytes = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1)).getBytes(oz.a.f46133a);
            kotlin.jvm.internal.m.e(bytes, "this as java.lang.String).getBytes(charset)");
            filterOutputStream.write(bytes);
            return;
        }
        b("Content-Disposition: form-data; name=\"%s\"", str);
        if (str2 != null) {
            b("; filename=\"%s\"", str2);
        }
        f(BuildConfig.VERSION_NAME, new Object[0]);
        if (str3 != null) {
            f("%s: %s", HttpHeaders.CONTENT_TYPE, str3);
        }
        f(BuildConfig.VERSION_NAME, new Object[0]);
    }

    public void d(String key, String str, Uri contentUri) throws Throwable {
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.f48597c;
        kotlin.jvm.internal.m.f(key, "key");
        kotlin.jvm.internal.m.f(contentUri, "contentUri");
        if (str == null) {
            str = "content/unknown";
        }
        c(key, key, str);
        int iJ = lf.j1.j(re.s.a().getContentResolver().openInputStream(contentUri), filterOutputStream);
        f(BuildConfig.VERSION_NAME, new Object[0]);
        h();
        ((lf.y0) this.f48598d).a(String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iJ)}, 1)), "    ".concat(key));
    }

    public void e(String key, ParcelFileDescriptor descriptor, String str) throws Throwable {
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.f48597c;
        kotlin.jvm.internal.m.f(key, "key");
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        if (str == null) {
            str = "content/unknown";
        }
        c(key, key, str);
        int iJ = lf.j1.j(new ParcelFileDescriptor.AutoCloseInputStream(descriptor), filterOutputStream);
        f(BuildConfig.VERSION_NAME, new Object[0]);
        h();
        ((lf.y0) this.f48598d).a(String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iJ)}, 1)), "    ".concat(key));
    }

    public void f(String str, Object... objArr) throws IOException {
        b(str, Arrays.copyOf(objArr, objArr.length));
        if (this.f48596b) {
            return;
        }
        b("\r\n", new Object[0]);
    }

    public void g(String key, Object obj, re.y yVar) throws Throwable {
        lf.y0 y0Var = (lf.y0) this.f48598d;
        kotlin.jvm.internal.m.f(key, "key");
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.f48597c;
        String str = re.y.f49225j;
        if (re.v.A(obj)) {
            a(key, re.v.m(obj));
            return;
        }
        if (obj instanceof Bitmap) {
            c(key, key, "image/png");
            ((Bitmap) obj).compress(Bitmap.CompressFormat.PNG, 100, filterOutputStream);
            f(BuildConfig.VERSION_NAME, new Object[0]);
            h();
            y0Var.a("<Image>", "    ".concat(key));
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            c(key, key, "content/unknown");
            filterOutputStream.write(bArr);
            f(BuildConfig.VERSION_NAME, new Object[0]);
            h();
            y0Var.a(String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1)), "    ".concat(key));
            return;
        }
        if (obj instanceof Uri) {
            d(key, null, (Uri) obj);
            return;
        }
        if (obj instanceof ParcelFileDescriptor) {
            e(key, (ParcelFileDescriptor) obj, null);
            return;
        }
        if (!(obj instanceof re.x)) {
            throw new IllegalArgumentException("value is not a supported type.");
        }
        re.x xVar = (re.x) obj;
        Parcelable parcelable = xVar.f49224b;
        String str2 = xVar.f49223a;
        if (parcelable instanceof ParcelFileDescriptor) {
            e(key, (ParcelFileDescriptor) parcelable, str2);
        } else {
            if (!(parcelable instanceof Uri)) {
                throw new IllegalArgumentException("value is not a supported type.");
            }
            d(key, str2, (Uri) parcelable);
        }
    }

    public void h() throws IOException {
        if (!this.f48596b) {
            f("--%s", re.y.f49225j);
            return;
        }
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.f48597c;
        byte[] bytes = "&".getBytes(oz.a.f46133a);
        kotlin.jvm.internal.m.e(bytes, "this as java.lang.String).getBytes(charset)");
        filterOutputStream.write(bytes);
    }

    @Override // re.w
    public void a(String key, String value) throws IOException {
        kotlin.jvm.internal.m.f(key, "key");
        kotlin.jvm.internal.m.f(value, "value");
        c(key, null, null);
        f(scqhIrGXy.tYFwlIyrs, value);
        h();
        lf.y0 y0Var = (lf.y0) this.f48598d;
        if (y0Var != null) {
            y0Var.a(value, "    ".concat(key));
        }
    }
}
