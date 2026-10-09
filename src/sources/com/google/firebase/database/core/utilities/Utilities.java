package com.google.firebase.database.core.utilities;

import android.net.Uri;
import android.util.Base64;
import com.adjust.sdk.Constants;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.RepoInfo;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ep.a;
import fa.EQx.nuRcCS;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import no.c;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Utilities {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f19432a = "0123456789abcdef".toCharArray();

    public static String a(double d5) {
        StringBuilder sb2 = new StringBuilder(16);
        long jDoubleToLongBits = Double.doubleToLongBits(d5);
        for (int i11 = 7; i11 >= 0; i11--) {
            int i12 = (int) ((jDoubleToLongBits >>> (i11 * 8)) & 255);
            char[] cArr = f19432a;
            sb2.append(cArr[(i12 >> 4) & 15]);
            sb2.append(cArr[i12 & 15]);
        }
        return sb2.toString();
    }

    public static String c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes(Constants.ENCODING));
            return Base64.encodeToString(messageDigest.digest(), 2);
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 encoding is required for Firebase Database to run!");
        } catch (NoSuchAlgorithmException e8) {
            throw new RuntimeException("Missing SHA-1 MessageDigest provider.", e8);
        }
    }

    public static String d(String str) {
        String strReplace = str.indexOf(92) != -1 ? str.replace("\\", "\\\\") : str;
        if (str.indexOf(34) != -1) {
            strReplace = strReplace.replace("\"", "\\\"");
        }
        return p.q("\"", strReplace, '\"');
    }

    public static Integer e(String str) {
        boolean z11;
        if (str.length() > 11 || str.length() == 0) {
            return null;
        }
        int i11 = 0;
        if (str.charAt(0) == '-') {
            z11 = true;
            if (str.length() == 1) {
                return null;
            }
            i11 = 1;
        } else {
            z11 = false;
        }
        long j11 = 0;
        while (i11 < str.length()) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < '0' || cCharAt > '9') {
                return null;
            }
            j11 = (j11 * 10) + ((long) (cCharAt - '0'));
            i11++;
        }
        if (!z11) {
            if (j11 > 2147483647L) {
                return null;
            }
            return Integer.valueOf((int) j11);
        }
        long j12 = -j11;
        if (j12 < -2147483648L) {
            return null;
        }
        return Integer.valueOf((int) j12);
    }

    public static Pair f(c cVar) {
        if (cVar != null) {
            return new Pair(null, cVar);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        return new Pair(taskCompletionSource.getTask(), new DatabaseReference.CompletionListener() { // from class: com.google.firebase.database.core.utilities.Utilities.1
            @Override // com.google.firebase.database.DatabaseReference.CompletionListener
            public final void a(DatabaseError databaseError, DatabaseReference databaseReference) {
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (databaseError != null) {
                    taskCompletionSource2.setException(databaseError.c());
                } else {
                    taskCompletionSource2.setResult(null);
                }
            }
        });
    }

    public static ParsedUrl b(String str) {
        String strSubstring;
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (scheme != null) {
                String host = uri.getHost();
                if (host != null) {
                    String queryParameter = uri.getQueryParameter("ns");
                    boolean z11 = false;
                    if (queryParameter == null) {
                        queryParameter = host.split("\\.", -1)[0].toLowerCase(Locale.US);
                    }
                    RepoInfo repoInfo = new RepoInfo();
                    repoInfo.f19281a = host.toLowerCase(Locale.US);
                    int port = uri.getPort();
                    if (port != -1) {
                        if (scheme.equals(Constants.SCHEME) || scheme.equals("wss")) {
                            z11 = true;
                        }
                        repoInfo.f19282b = z11;
                        repoInfo.f19281a += ":" + port;
                    } else {
                        repoInfo.f19282b = true;
                    }
                    repoInfo.f19283c = queryParameter;
                    int iIndexOf = str.indexOf("//");
                    if (iIndexOf != -1) {
                        String strSubstring2 = str.substring(iIndexOf + 2);
                        int iIndexOf2 = strSubstring2.indexOf("/");
                        if (iIndexOf2 != -1) {
                            int iIndexOf3 = strSubstring2.indexOf("?");
                            if (iIndexOf3 != -1) {
                                strSubstring = strSubstring2.substring(iIndexOf2 + 1, iIndexOf3);
                            } else {
                                strSubstring = strSubstring2.substring(iIndexOf2 + 1);
                            }
                        } else {
                            strSubstring = BuildConfig.VERSION_NAME;
                        }
                        String strReplace = strSubstring.replace(nuRcCS.fnugnIY, " ");
                        Validation.b(strReplace);
                        ParsedUrl parsedUrl = new ParsedUrl();
                        parsedUrl.f19424b = new Path(strReplace);
                        parsedUrl.f19423a = repoInfo;
                        return parsedUrl;
                    }
                    throw new DatabaseException("Firebase Database URL is missing URL scheme");
                }
                throw new IllegalArgumentException("Database URL does not specify a valid host");
            }
            throw new IllegalArgumentException("Database URL does not specify a URL scheme");
        } catch (Exception e8) {
            throw new DatabaseException(a.e("Invalid Firebase Database url specified: ", str), e8);
        }
    }
}
