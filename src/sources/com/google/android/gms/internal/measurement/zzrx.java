package com.google.android.gms.internal.measurement;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzrx extends zzsy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11929a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11932d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11931c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzsd f11930b = new zzsd();

    public zzrx(zzrw zzrwVar) {
        this.f11929a = zzrwVar.f11928a;
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final InputStream a(Uri uri) throws zzsg, zzsi {
        if (i(uri)) {
            throw new zzsg("Android backend cannot perform remote operations without a remote backend");
        }
        File fileA = zzsc.a(h(uri));
        return new zzsl(new FileInputStream(fileA), fileA);
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final boolean b(Uri uri) throws zzsg {
        if (i(uri)) {
            throw new zzsg("Android backend cannot perform remote operations without a remote backend");
        }
        return zzsc.a(h(uri)).exists();
    }

    @Override // com.google.android.gms.internal.measurement.zzsy
    public final zzsd g() {
        return this.f11930b;
    }

    @Override // com.google.android.gms.internal.measurement.zzsy
    public final Uri h(Uri uri) throws IOException {
        if (i(uri)) {
            throw new zzsi("Operation across authorities is not allowed.");
        }
        File fileC = c(uri);
        zzsb zzsbVar = new zzsb(0);
        String absolutePath = fileC.getAbsolutePath();
        Uri.Builder builder = zzsbVar.f11946a;
        builder.path(absolutePath);
        ImmutableList immutableListJ = zzsbVar.f11947b.j();
        Pattern pattern = zzsp.f11954a;
        return builder.encodedFragment(immutableListJ.isEmpty() ? null : "transform=".concat(String.valueOf(new Joiner("+").c(immutableListJ)))).build();
    }

    public final boolean i(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.f11929a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final String zzc() {
        return "android";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:54:0x0110  */
    /* JADX WARN: Code duplicated, block: B:58:0x0117 A[Catch: all -> 0x012a, TryCatch #1 {all -> 0x012a, blocks: (B:56:0x0113, B:58:0x0117, B:61:0x012c, B:62:0x012e), top: B:82:0x0113 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x013a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.measurement.zzsx
    public final File c(Uri uri) throws IOException {
        File externalFilesDir;
        boolean z11;
        Account account;
        File file;
        String str;
        if (!i(uri)) {
            Context context = this.f11929a;
            if (uri.getScheme().equals("android")) {
                if (!uri.getPathSegments().isEmpty()) {
                    if (TextUtils.isEmpty(uri.getQuery())) {
                        ArrayList arrayList = new ArrayList(uri.getPathSegments());
                        String str2 = (String) arrayList.get(0);
                        switch (str2.hashCode()) {
                            case -1820761141:
                                if (str2.equals("external")) {
                                    externalFilesDir = context.getExternalFilesDir(null);
                                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                                    if (!zzky.b(context)) {
                                        synchronized (this.f11931c) {
                                            try {
                                                if (this.f11932d == null) {
                                                    this.f11932d = zzry.a(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                                }
                                                str = this.f11932d;
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                            break;
                                        }
                                        if (!file.getAbsolutePath().startsWith(str)) {
                                            throw new zzsg(scqhIrGXy.PmLkkDPaTdFX);
                                        }
                                    }
                                    return file;
                                }
                                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
                            case 94416770:
                                if (str2.equals("cache")) {
                                    externalFilesDir = context.getCacheDir();
                                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                                    if (!zzky.b(context)) {
                                        synchronized (this.f11931c) {
                                            if (this.f11932d == null) {
                                                this.f11932d = zzry.a(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                            }
                                            str = this.f11932d;
                                            if (!file.getAbsolutePath().startsWith(str)) {
                                                throw new zzsg(scqhIrGXy.PmLkkDPaTdFX);
                                            }
                                        }
                                    }
                                    return file;
                                }
                                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
                            case 97434231:
                                if (str2.equals("files")) {
                                    externalFilesDir = zzry.a(context);
                                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                                    if (!zzky.b(context)) {
                                        synchronized (this.f11931c) {
                                            if (this.f11932d == null) {
                                                this.f11932d = zzry.a(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                            }
                                            str = this.f11932d;
                                            if (!file.getAbsolutePath().startsWith(str)) {
                                                throw new zzsg(scqhIrGXy.PmLkkDPaTdFX);
                                            }
                                        }
                                    }
                                    return file;
                                }
                                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
                            case 835260319:
                                if (str2.equals("managed")) {
                                    File file2 = new File(zzry.a(context), "managed");
                                    if (arrayList.size() >= 3) {
                                        try {
                                            String str3 = (String) arrayList.get(2);
                                            Account account2 = zzrv.f11927a;
                                            if ("shared".equals(str3)) {
                                                account = zzrv.f11927a;
                                            } else {
                                                int iIndexOf = str3.indexOf(58);
                                                if (iIndexOf >= 0) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                zzsq.a(z11, "Malformed account", new Object[0]);
                                                account = new Account(str3.substring(iIndexOf + 1), str3.substring(0, iIndexOf));
                                            }
                                            if (!zzrv.f11927a.equals(account)) {
                                                throw new zzsi("AccountManager cannot be null");
                                            }
                                        } catch (IllegalArgumentException e8) {
                                            throw new zzsi(e8);
                                        }
                                    }
                                    externalFilesDir = file2;
                                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                                    if (!zzky.b(context)) {
                                        synchronized (this.f11931c) {
                                            if (this.f11932d == null) {
                                                this.f11932d = zzry.a(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                            }
                                            str = this.f11932d;
                                            if (!file.getAbsolutePath().startsWith(str)) {
                                                throw new zzsg(scqhIrGXy.PmLkkDPaTdFX);
                                            }
                                        }
                                    }
                                    return file;
                                }
                                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
                            case 988548496:
                                if (str2.equals("directboot-cache")) {
                                    externalFilesDir = context.createDeviceProtectedStorageContext().getCacheDir();
                                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                                    if (!zzky.b(context)) {
                                        synchronized (this.f11931c) {
                                            if (this.f11932d == null) {
                                                this.f11932d = zzry.a(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                            }
                                            str = this.f11932d;
                                            if (!file.getAbsolutePath().startsWith(str)) {
                                                throw new zzsg(scqhIrGXy.PmLkkDPaTdFX);
                                            }
                                        }
                                    }
                                    return file;
                                }
                                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
                            case 991565957:
                                if (str2.equals("directboot-files")) {
                                    externalFilesDir = context.createDeviceProtectedStorageContext().getFilesDir();
                                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                                    if (!zzky.b(context)) {
                                        synchronized (this.f11931c) {
                                            if (this.f11932d == null) {
                                                this.f11932d = zzry.a(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                            }
                                            str = this.f11932d;
                                            if (!file.getAbsolutePath().startsWith(str)) {
                                                throw new zzsg(scqhIrGXy.PmLkkDPaTdFX);
                                            }
                                        }
                                    }
                                    return file;
                                }
                                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
                            default:
                                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
                        }
                    }
                    throw new zzsi("Did not expect uri to have query");
                }
                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
            }
            throw new zzsi(IMCc.nUyAEkS);
        }
        throw new IOException("operation is not permitted in other authorities.");
    }
}
