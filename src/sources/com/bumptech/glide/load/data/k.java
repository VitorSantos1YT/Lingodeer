package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zd.h f7668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HttpURLConnection f7670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InputStream f7671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f7672e;

    public k(zd.h hVar, int i11) {
        this.f7668a = hVar;
        this.f7669b = i11;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        InputStream inputStream = this.f7671d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f7670c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f7670c = null;
    }

    public final InputStream c(URL url, int i11, URL url2, Map map) throws HttpException {
        int responseCode;
        int responseCode2 = -1;
        if (i11 >= 5) {
            throw new HttpException(-1, null, "Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException(-1, null, "In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i12 = this.f7669b;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i12);
            httpURLConnection.setReadTimeout(i12);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f7670c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f7671d = this.f7670c.getInputStream();
                if (this.f7672e) {
                    return null;
                }
                try {
                    responseCode = this.f7670c.getResponseCode();
                } catch (IOException unused2) {
                    responseCode = -1;
                }
                int i13 = responseCode / 100;
                if (i13 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f7670c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f7671d = new pe.d(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                httpURLConnection2.getContentEncoding();
                            }
                            this.f7671d = httpURLConnection2.getInputStream();
                        }
                        return this.f7671d;
                    } catch (IOException e8) {
                        try {
                            responseCode2 = httpURLConnection2.getResponseCode();
                        } catch (IOException unused3) {
                        }
                        throw new HttpException(responseCode2, e8, "Failed to obtain InputStream");
                    }
                }
                if (i13 != 3) {
                    if (responseCode == -1) {
                        throw new HttpException(responseCode, null, "Http request failed");
                    }
                    try {
                        throw new HttpException(responseCode, null, this.f7670c.getResponseMessage());
                    } catch (IOException e10) {
                        throw new HttpException(responseCode, e10, "Failed to get a response message");
                    }
                }
                String headerField = this.f7670c.getHeaderField(HttpHeaders.LOCATION);
                if (TextUtils.isEmpty(headerField)) {
                    throw new HttpException(responseCode, null, "Received empty or null redirect url");
                }
                try {
                    URL url3 = new URL(url, headerField);
                    b();
                    return c(url3, i11 + 1, url, map);
                } catch (MalformedURLException e11) {
                    throw new HttpException(responseCode, e11, ep.a.e("Bad redirect url: ", headerField));
                }
            } catch (IOException e12) {
                try {
                    responseCode2 = this.f7670c.getResponseCode();
                } catch (IOException unused4) {
                }
                throw new HttpException(responseCode2, e12, "Failed to connect or obtain data");
            }
        } catch (IOException e13) {
            throw new HttpException(0, e13, "URL.openConnection threw");
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.f7672e = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public final td.a d() {
        return td.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.k kVar, c cVar) {
        zd.h hVar = this.f7668a;
        int i11 = pe.h.f46822a;
        SystemClock.elapsedRealtimeNanos();
        try {
            cVar.f(c(hVar.d(), 0, null, hVar.f59161b.a()));
        } catch (IOException e8) {
            cVar.c(e8);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }
}
