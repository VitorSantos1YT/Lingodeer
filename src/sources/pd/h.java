package pd;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import dy.u;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements Comparable {
    private static final String DEFAULT_PARAMS_ENCODING = "UTF-8";
    private a mCacheEntry;
    private boolean mCanceled;
    private final int mDefaultTrafficStatsTag;
    private j mErrorListener;
    private final o mEventLog;
    private final Object mLock;
    private final int mMethod;
    private f mRequestCompleteListener;
    private i mRequestQueue;
    private boolean mResponseDelivered;
    private m mRetryPolicy;
    private Integer mSequence;
    private boolean mShouldCache;
    private boolean mShouldRetryConnectionErrors;
    private boolean mShouldRetryServerErrors;
    private Object mTag;
    private final String mUrl;

    public h(String str, j jVar) {
        Uri uri;
        String host;
        this.mEventLog = o.f46805c ? new o() : null;
        this.mLock = new Object();
        this.mShouldCache = true;
        int iHashCode = 0;
        this.mCanceled = false;
        this.mResponseDelivered = false;
        this.mShouldRetryServerErrors = false;
        this.mShouldRetryConnectionErrors = false;
        this.mCacheEntry = null;
        this.mMethod = 0;
        this.mUrl = str;
        this.mErrorListener = jVar;
        a9.e eVar = new a9.e(5);
        eVar.f478b = 2500;
        setRetryPolicy(eVar);
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.mDefaultTrafficStatsTag = iHashCode;
    }

    public static byte[] a(String str, Map map) {
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
                sb2.append(URLEncoder.encode((String) entry.getKey(), str));
                sb2.append('=');
                sb2.append(URLEncoder.encode((String) entry.getValue(), str));
                sb2.append('&');
            }
            return sb2.toString().getBytes(str);
        } catch (UnsupportedEncodingException e8) {
            throw new RuntimeException(ep.a.e("Encoding not supported: ", str), e8);
        }
    }

    public void addMarker(String str) {
        if (o.f46805c) {
            this.mEventLog.a(Thread.currentThread().getId(), str);
        }
    }

    public void cancel() {
        synchronized (this.mLock) {
            this.mCanceled = true;
            this.mErrorListener = null;
        }
    }

    public void deliverError(VolleyError volleyError) {
        j jVar;
        synchronized (this.mLock) {
            jVar = this.mErrorListener;
        }
        if (jVar != null) {
            jVar.g(volleyError);
        }
    }

    public abstract void deliverResponse(Object obj);

    public void finish(String str) {
        i iVar = this.mRequestQueue;
        if (iVar != null) {
            synchronized (iVar.f46788b) {
                iVar.f46788b.remove(this);
            }
            synchronized (iVar.f46796j) {
                Iterator it = iVar.f46796j.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            iVar.b();
        }
        if (o.f46805c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new u(this, str, id2));
            } else {
                this.mEventLog.a(id2, str);
                this.mEventLog.b(toString());
            }
        }
    }

    public byte[] getBody() {
        Map<String, String> params = getParams();
        if (params == null || params.size() <= 0) {
            return null;
        }
        return a(getParamsEncoding(), params);
    }

    public String getBodyContentType() {
        return "application/x-www-form-urlencoded; charset=" + getParamsEncoding();
    }

    public a getCacheEntry() {
        return this.mCacheEntry;
    }

    public String getCacheKey() {
        String url = getUrl();
        int method = getMethod();
        if (method == 0 || method == -1) {
            return url;
        }
        return Integer.toString(method) + '-' + url;
    }

    public j getErrorListener() {
        j jVar;
        synchronized (this.mLock) {
            jVar = this.mErrorListener;
        }
        return jVar;
    }

    public Map<String, String> getHeaders() {
        return Collections.EMPTY_MAP;
    }

    public int getMethod() {
        return this.mMethod;
    }

    public Map<String, String> getParams() {
        return null;
    }

    public String getParamsEncoding() {
        return "UTF-8";
    }

    @Deprecated
    public byte[] getPostBody() {
        Map<String, String> postParams = getPostParams();
        if (postParams == null || postParams.size() <= 0) {
            return null;
        }
        return a(getPostParamsEncoding(), postParams);
    }

    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    @Deprecated
    public Map<String, String> getPostParams() {
        return getParams();
    }

    @Deprecated
    public String getPostParamsEncoding() {
        return getParamsEncoding();
    }

    public g getPriority() {
        return g.NORMAL;
    }

    public m getRetryPolicy() {
        return this.mRetryPolicy;
    }

    public final int getSequence() {
        Integer num = this.mSequence;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public Object getTag() {
        return this.mTag;
    }

    public final int getTimeoutMs() {
        return ((a9.e) getRetryPolicy()).f478b;
    }

    public int getTrafficStatsTag() {
        return this.mDefaultTrafficStatsTag;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean hasHadResponseDelivered() {
        boolean z11;
        synchronized (this.mLock) {
            z11 = this.mResponseDelivered;
        }
        return z11;
    }

    public boolean isCanceled() {
        boolean z11;
        synchronized (this.mLock) {
            z11 = this.mCanceled;
        }
        return z11;
    }

    public void markDelivered() {
        synchronized (this.mLock) {
            this.mResponseDelivered = true;
        }
    }

    public void notifyListenerResponseNotUsable() {
        f fVar;
        synchronized (this.mLock) {
            fVar = this.mRequestCompleteListener;
        }
        if (fVar != null) {
            ((ob.i) fVar).s(this);
        }
    }

    public void notifyListenerResponseReceived(l lVar) {
        f fVar;
        List list;
        synchronized (this.mLock) {
            fVar = this.mRequestCompleteListener;
        }
        if (fVar != null) {
            ob.i iVar = (ob.i) fVar;
            a aVar = lVar.f46799b;
            if (aVar != null) {
                if (aVar.f46765e >= System.currentTimeMillis()) {
                    String cacheKey = getCacheKey();
                    synchronized (iVar) {
                        list = (List) ((HashMap) iVar.f44813b).remove(cacheKey);
                    }
                    if (list != null) {
                        if (p.f46808a) {
                            p.b("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), cacheKey);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((o20.i) iVar.f44814c).d((h) it.next(), lVar, null);
                        }
                        return;
                    }
                    return;
                }
            }
            iVar.s(this);
        }
    }

    public abstract l parseNetworkResponse(e eVar);

    public void sendEvent(int i11) {
        i iVar = this.mRequestQueue;
        if (iVar != null) {
            iVar.b();
        }
    }

    public h setCacheEntry(a aVar) {
        this.mCacheEntry = aVar;
        return this;
    }

    public void setNetworkRequestCompleteListener(f fVar) {
        synchronized (this.mLock) {
            this.mRequestCompleteListener = fVar;
        }
    }

    public h setRequestQueue(i iVar) {
        this.mRequestQueue = iVar;
        return this;
    }

    public h setRetryPolicy(m mVar) {
        this.mRetryPolicy = mVar;
        return this;
    }

    public final h setSequence(int i11) {
        this.mSequence = Integer.valueOf(i11);
        return this;
    }

    public final h setShouldCache(boolean z11) {
        this.mShouldCache = z11;
        return this;
    }

    public final h setShouldRetryConnectionErrors(boolean z11) {
        this.mShouldRetryConnectionErrors = z11;
        return this;
    }

    public final h setShouldRetryServerErrors(boolean z11) {
        this.mShouldRetryServerErrors = z11;
        return this;
    }

    public h setTag(Object obj) {
        this.mTag = obj;
        return this;
    }

    public final boolean shouldCache() {
        return this.mShouldCache;
    }

    public final boolean shouldRetryConnectionErrors() {
        return this.mShouldRetryConnectionErrors;
    }

    public final boolean shouldRetryServerErrors() {
        return this.mShouldRetryServerErrors;
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(getTrafficStatsTag());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(isCanceled() ? "[X] " : "[ ] ");
        sb2.append(getUrl());
        sb2.append(" ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(getPriority());
        sb2.append(" ");
        sb2.append(this.mSequence);
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(h hVar) {
        g priority = getPriority();
        g priority2 = hVar.getPriority();
        return priority == priority2 ? this.mSequence.intValue() - hVar.mSequence.intValue() : priority2.ordinal() - priority.ordinal();
    }

    public VolleyError parseNetworkError(VolleyError volleyError) {
        return volleyError;
    }
}
