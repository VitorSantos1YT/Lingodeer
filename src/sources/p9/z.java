package p9;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f46721e = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f46722f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46723a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f46725c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f46724b = new Object[2];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f46726d = {Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};

    public z(Context context, d0 d0Var) {
        this.f46723a = context;
        this.f46725c = d0Var;
    }

    public final Preference b(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? a(str, this.f46726d, attributeSet) : a(str, null, attributeSet);
        } catch (InflateException e8) {
            throw e8;
        } catch (ClassNotFoundException e10) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e10);
            throw inflateException;
        } catch (Exception e11) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e11);
            throw inflateException2;
        }
    }

    public final PreferenceGroup c(XmlResourceParser xmlResourceParser, PreferenceGroup preferenceGroup) {
        int next;
        synchronized (this.f46724b) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
            this.f46724b[0] = this.f46723a;
            do {
                try {
                    try {
                        try {
                            next = xmlResourceParser.next();
                            if (next == 2) {
                                break;
                            }
                        } catch (IOException e8) {
                            InflateException inflateException = new InflateException(xmlResourceParser.getPositionDescription() + ": " + e8.getMessage());
                            inflateException.initCause(e8);
                            throw inflateException;
                        }
                    } catch (InflateException e10) {
                        throw e10;
                    }
                } catch (XmlPullParserException e11) {
                    InflateException inflateException2 = new InflateException(e11.getMessage());
                    inflateException2.initCause(e11);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlResourceParser.getPositionDescription() + ": No start tag found!");
            }
            PreferenceGroup preferenceGroup2 = (PreferenceGroup) b(xmlResourceParser.getName(), attributeSetAsAttributeSet);
            if (preferenceGroup == null) {
                preferenceGroup2.m(this.f46725c);
                preferenceGroup = preferenceGroup2;
            }
            d(xmlResourceParser, preferenceGroup, attributeSetAsAttributeSet);
        }
        return preferenceGroup;
    }

    public final void d(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        long jLongValue;
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.O = Intent.parseIntent(this.f46723a.getResources(), xmlPullParser, attributeSet);
                    } catch (IOException e8) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e8);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    Resources resources = this.f46723a.getResources();
                    if (preference.Q == null) {
                        preference.Q = new Bundle();
                    }
                    resources.parseBundleExtra("extra", attributeSet, preference.Q);
                    try {
                        int depth2 = xmlPullParser.getDepth();
                        while (true) {
                            int next2 = xmlPullParser.next();
                            if (next2 == 1 || (next2 == 3 && xmlPullParser.getDepth() <= depth2)) {
                                break;
                            }
                        }
                    } catch (IOException e10) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e10);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference preferenceB = b(name, attributeSet);
                    PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
                    if (!preferenceGroup.f2353r0.contains(preferenceB)) {
                        if (preferenceB.N != null) {
                            PreferenceGroup preferenceGroup2 = preferenceGroup;
                            while (true) {
                                PreferenceGroup preferenceGroup3 = preferenceGroup2.f2335k0;
                                if (preferenceGroup3 == null) {
                                    break;
                                } else {
                                    preferenceGroup2 = preferenceGroup3;
                                }
                            }
                            preferenceGroup2.E(preferenceB.N);
                        }
                        int i11 = preferenceB.f2340t;
                        if (i11 == Integer.MAX_VALUE) {
                            if (preferenceGroup.f2354s0) {
                                int i12 = preferenceGroup.f2355t0;
                                preferenceGroup.f2355t0 = i12 + 1;
                                if (i12 != i11) {
                                    preferenceB.f2340t = i12;
                                    y yVar = preferenceB.f2333i0;
                                    if (yVar != null) {
                                        Handler handler = yVar.f46719e;
                                        aj.i iVar = yVar.f46720f;
                                        handler.removeCallbacks(iVar);
                                        handler.post(iVar);
                                    }
                                }
                            }
                            if (preferenceB instanceof PreferenceGroup) {
                                ((PreferenceGroup) preferenceB).f2354s0 = preferenceGroup.f2354s0;
                            }
                        }
                        int iBinarySearch = Collections.binarySearch(preferenceGroup.f2353r0, preferenceB);
                        if (iBinarySearch < 0) {
                            iBinarySearch = (iBinarySearch * (-1)) - 1;
                        }
                        boolean zA = preferenceGroup.A();
                        if (preferenceB.X == zA) {
                            preferenceB.X = !zA;
                            preferenceB.k(preferenceB.A());
                            preferenceB.j();
                        }
                        synchronized (preferenceGroup) {
                            preferenceGroup.f2353r0.add(iBinarySearch, preferenceB);
                        }
                        d0 d0Var = preferenceGroup.f2321b;
                        String str = preferenceB.N;
                        if (str == null || !preferenceGroup.f2351p0.containsKey(str)) {
                            synchronized (d0Var) {
                                jLongValue = d0Var.f46644b;
                                d0Var.f46644b = 1 + jLongValue;
                            }
                        } else {
                            jLongValue = ((Long) preferenceGroup.f2351p0.get(str)).longValue();
                            preferenceGroup.f2351p0.remove(str);
                        }
                        preferenceB.f2323c = jLongValue;
                        preferenceB.f2325d = true;
                        try {
                            preferenceB.m(d0Var);
                            preferenceB.f2325d = false;
                            if (preferenceB.f2335k0 != null) {
                                throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
                            }
                            preferenceB.f2335k0 = preferenceGroup;
                            if (preferenceGroup.f2356u0) {
                                preferenceB.l();
                            }
                            y yVar2 = preferenceGroup.f2333i0;
                            if (yVar2 != null) {
                                Handler handler2 = yVar2.f46719e;
                                aj.i iVar2 = yVar2.f46720f;
                                handler2.removeCallbacks(iVar2);
                                handler2.post(iVar2);
                            }
                        } catch (Throwable th2) {
                            preferenceB.f2325d = false;
                            throw th2;
                        }
                    }
                    d(xmlPullParser, preferenceB, attributeSet);
                }
            }
        }
    }

    public final Preference a(String str, String[] strArr, AttributeSet attributeSet) throws ClassNotFoundException {
        Class<?> cls;
        HashMap map = f46722f;
        Constructor<?> constructor = (Constructor) map.get(str);
        String str2 = gkbGsXmgaxRjJ.wIkbSbAAupqfUo;
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f46723a.getClassLoader();
                    if (strArr == null || strArr.length == 0) {
                        cls = Class.forName(str, false, classLoader);
                    } else {
                        cls = null;
                        ClassNotFoundException e8 = null;
                        for (String str3 : strArr) {
                            try {
                                cls = Class.forName(str3 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e10) {
                                e8 = e10;
                            }
                        }
                        if (cls == null) {
                            if (e8 != null) {
                                throw e8;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + str2 + str);
                        }
                    }
                    constructor = cls.getConstructor(f46721e);
                    constructor.setAccessible(true);
                    map.put(str, constructor);
                } catch (Exception e11) {
                    InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + str2 + str);
                    inflateException.initCause(e11);
                    throw inflateException;
                }
            } catch (ClassNotFoundException e12) {
                throw e12;
            }
        }
        Object[] objArr = this.f46724b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }
}
