package app.rive.runtime.kotlin.fonts;

import android.util.Xml;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ep.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.f;
import ns.o;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import oz.q;
import oz.x;
import qy.l;
import ry.m;
import ry.n;
import ry.r;
import ry.s;
import sy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class SystemFontsParser {
    public static final int $stable = 0;
    public static final String FALLBACK_FONTS_XML_PATH = "/system/etc/system_fallback.xml";
    public static final String FONTS_XML_PATH = "/system/etc/fonts.xml";
    public static final String SYSTEM_FONTS_XML_PATH = "/system/etc/system_fonts.xml";
    private static final String TAG = "SystemFontsParser";
    private static final List<l> fontFilesOrder;
    public static final Companion Companion = new Companion(null);
    private static final List<String> SYSTEM_FONTS_PATHS = o.L("/system/fonts/", "/system/font/", "/data/fonts/", "/system/product/fonts/");

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private final l fromFileFonts(List<Fonts.FileFont> list, List<String> list2, String str, String str2, String str3) {
            String lang = str2;
            String variant = str3;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<T> it = list.iterator();
            int i11 = 0;
            while (true) {
                String str4 = null;
                if (!it.hasNext()) {
                    if (linkedHashMap.isEmpty()) {
                        return new l(new Fonts.Family(str, variant, lang, s.f50855a), r.f50854a);
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        String string = q.i1((String) it2.next()).toString();
                        Fonts.Alias alias = string.length() > 0 ? new Fonts.Alias(string, str, null) : null;
                        if (alias != null) {
                            arrayList.add(alias);
                        }
                    }
                    if (variant == null) {
                        Fonts.FileFont fileFont = (Fonts.FileFont) m.s0(list);
                        variant = fileFont != null ? fileFont.getVariant() : null;
                    }
                    if (lang == null) {
                        Fonts.FileFont fileFont2 = (Fonts.FileFont) m.s0(list);
                        lang = fileFont2 != null ? fileFont2.getLang() : null;
                    }
                    String string2 = variant != null ? q.i1(variant).toString() : null;
                    if (string2 == null || q.K0(string2)) {
                        string2 = null;
                    }
                    String string3 = lang != null ? q.i1(lang).toString() : null;
                    if (string3 != null && !q.K0(string3)) {
                        str4 = string3;
                    }
                    return new l(new Fonts.Family(str, string2, str4, linkedHashMap), arrayList);
                }
                Object next = it.next();
                int i12 = i11 + 1;
                if (i11 < 0) {
                    o.V();
                    throw null;
                }
                Fonts.FileFont fileFont3 = (Fonts.FileFont) next;
                if (i11 >= SystemFontsParser.fontFilesOrder.size()) {
                    SystemFontsParser.fontFilesOrder.size();
                    fileFont3.getName();
                } else {
                    l lVar = (l) SystemFontsParser.fontFilesOrder.get(i11);
                    Fonts.Weight weight = (Fonts.Weight) lVar.f48495a;
                    String str5 = (String) lVar.f48496b;
                    String string4 = q.i1(fileFont3.getName()).toString();
                    if (string4.length() != 0) {
                        Fonts.Font font = new Fonts.Font(weight, str5, string4, null, 0, null, null, 112, null);
                        Object arrayList2 = linkedHashMap.get(weight);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            linkedHashMap.put(weight, arrayList2);
                        }
                        ((List) arrayList2).add(font);
                    }
                }
                i11 = i12;
            }
        }

        private final l fromFontList(String str, List<Fonts.Font> list, String str2, String str3) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Fonts.Font font : list) {
                if (!q.K0(font.getName())) {
                    Fonts.Weight weight = font.getWeight();
                    Object arrayList = linkedHashMap.get(weight);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(weight, arrayList);
                    }
                    ((List) arrayList).add(font);
                }
            }
            boolean zIsEmpty = linkedHashMap.isEmpty();
            r rVar = r.f50854a;
            return zIsEmpty ? new l(new Fonts.Family(str, str3, str2, s.f50855a), rVar) : new l(new Fonts.Family(str, str3, str2, linkedHashMap), rVar);
        }

        private final String getOptionalAttribute(XmlPullParser xmlPullParser, String str, String str2) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue == null ? str2 : attributeValue;
        }

        public static /* synthetic */ String getOptionalAttribute$default(Companion companion, XmlPullParser xmlPullParser, String str, String str2, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            return companion.getOptionalAttribute(xmlPullParser, str, str2);
        }

        private final String getRequiredAttribute(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new IllegalArgumentException(a.e("Missing required attribute: ", str));
        }

        private final Fonts.Alias readAlias(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            XmlPullParser xmlPullParser2;
            xmlPullParser.require(2, null, "alias");
            try {
                String requiredAttribute = getRequiredAttribute(xmlPullParser, "name");
                String requiredAttribute2 = getRequiredAttribute(xmlPullParser, "to");
                xmlPullParser2 = xmlPullParser;
                try {
                    String optionalAttribute$default = getOptionalAttribute$default(this, xmlPullParser2, "weight", null, 4, null);
                    Fonts.Weight weightFromString = optionalAttribute$default != null ? Fonts.Weight.Companion.fromString(optionalAttribute$default) : null;
                    skip(xmlPullParser2);
                    if (!q.K0(requiredAttribute) && !q.K0(requiredAttribute2)) {
                        return new Fonts.Alias(q.i1(requiredAttribute).toString(), q.i1(requiredAttribute2).toString(), weightFromString);
                    }
                    return null;
                } catch (IllegalArgumentException e8) {
                    e = e8;
                    e.getMessage();
                    skip(xmlPullParser2);
                    return null;
                }
            } catch (IllegalArgumentException e10) {
                e = e10;
                xmlPullParser2 = xmlPullParser;
            }
        }

        private final Fonts.Axis readAxis(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            String requiredAttribute = getRequiredAttribute(xmlPullParser, "tag");
            String requiredAttribute2 = getRequiredAttribute(xmlPullParser, "stylevalue");
            skip(xmlPullParser);
            if (q.K0(requiredAttribute) || q.K0(requiredAttribute2)) {
                throw new IllegalArgumentException("Axis tag found with blank 'tag' or 'stylevalue'.");
            }
            return new Fonts.Axis(requiredAttribute, requiredAttribute2);
        }

        private final Fonts.Family readFamily(String str, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            Companion companion = SystemFontsParser.Companion;
            String optionalAttribute$default = getOptionalAttribute$default(companion, xmlPullParser, "lang", null, 4, null);
            String optionalAttribute$default2 = getOptionalAttribute$default(companion, xmlPullParser, "variant", null, 4, null);
            String optionalAttribute$default3 = getOptionalAttribute$default(companion, xmlPullParser, "ignore", null, 4, null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    String name = xmlPullParser.getName();
                    kotlin.jvm.internal.m.e(name, "getName(...)");
                    if (kotlin.jvm.internal.m.a(q.i1(name).toString(), "font")) {
                        try {
                            Fonts.Font font = readFont(xmlPullParser);
                            Fonts.Weight weight = font.getWeight();
                            Object arrayList = linkedHashMap.get(weight);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(weight, arrayList);
                            }
                            ((List) arrayList).add(font);
                        } catch (Exception e8) {
                            e8.getMessage();
                        }
                    } else {
                        skip(xmlPullParser);
                    }
                }
            }
            if (m.i0(o.L("true", "1"), optionalAttribute$default3) || linkedHashMap.isEmpty()) {
                return null;
            }
            return new Fonts.Family(str, optionalAttribute$default2, optionalAttribute$default, linkedHashMap);
        }

        private final Fonts.Family readFamilyEntry(XmlPullParser xmlPullParser, List<Fonts.Alias> list) throws XmlPullParserException, IOException {
            xmlPullParser.require(2, null, "family");
            String optionalAttribute$default = getOptionalAttribute$default(this, xmlPullParser, "name", null, 4, null);
            String string = optionalAttribute$default != null ? q.i1(optionalAttribute$default).toString() : null;
            if (string != null && string.length() > 0) {
                return readFamily(string, xmlPullParser);
            }
            l legacyFamily = readLegacyFamily(xmlPullParser);
            if (legacyFamily == null) {
                return null;
            }
            Fonts.Family family = (Fonts.Family) legacyFamily.f48495a;
            List list2 = (List) legacyFamily.f48496b;
            if (!list2.isEmpty()) {
                list.addAll(list2);
            }
            return family;
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
        private final List<Fonts.FileFont> readFileset(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            XmlPullParser xmlPullParser2;
            String string;
            c cVarO = o.o();
            xmlPullParser.require(2, null, "fileset");
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    String name = xmlPullParser.getName();
                    kotlin.jvm.internal.m.e(name, "getName(...)");
                    if (kotlin.jvm.internal.m.a(q.i1(name).toString(), "file")) {
                        Companion companion = SystemFontsParser.Companion;
                        xmlPullParser2 = xmlPullParser;
                        String optionalAttribute$default = getOptionalAttribute$default(companion, xmlPullParser2, "variant", null, 4, null);
                        if (optionalAttribute$default == null || q.K0(optionalAttribute$default)) {
                            optionalAttribute$default = null;
                        }
                        String optionalAttribute$default2 = getOptionalAttribute$default(companion, xmlPullParser2, "lang", null, 4, null);
                        if (optionalAttribute$default2 == null || q.K0(optionalAttribute$default2)) {
                            optionalAttribute$default2 = null;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        if (xmlPullParser2.next() == 4) {
                            String text = xmlPullParser2.getText();
                            if (text == null || (string = q.i1(text).toString()) == null) {
                                string = BuildConfig.VERSION_NAME;
                            }
                            sb2.append(string);
                            xmlPullParser2.next();
                        }
                        String string2 = sb2.toString();
                        kotlin.jvm.internal.m.e(string2, "toString(...)");
                        if (xmlPullParser2.getEventType() == 3) {
                            String name2 = xmlPullParser2.getName();
                            kotlin.jvm.internal.m.e(name2, "getName(...)");
                            if (!kotlin.jvm.internal.m.a(q.i1(name2).toString(), "file")) {
                                xmlPullParser2.getEventType();
                                xmlPullParser2.getName();
                            }
                        } else {
                            xmlPullParser2.getEventType();
                            xmlPullParser2.getName();
                        }
                        if (string2.length() == 0) {
                            string2 = null;
                        }
                        if (string2 != null) {
                            cVarO.add(new Fonts.FileFont(string2, optionalAttribute$default, optionalAttribute$default2));
                        }
                    } else {
                        xmlPullParser2 = xmlPullParser;
                        SystemFontsParser.Companion.skip(xmlPullParser2);
                    }
                    xmlPullParser = xmlPullParser2;
                }
            }
            return o.e(cVarO);
        }

        private final Fonts.Font readFont(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            String text;
            Integer numT0;
            xmlPullParser.require(2, null, "font");
            Fonts.Weight.Companion companion = Fonts.Weight.Companion;
            Fonts.Weight weightFromString = companion.fromString(getOptionalAttribute(xmlPullParser, "weight", String.valueOf(companion.getNORMAL().getWeight())));
            String optionalAttribute = getOptionalAttribute(xmlPullParser, "style", "normal");
            String str = optionalAttribute == null ? "normal" : optionalAttribute;
            String optionalAttribute$default = getOptionalAttribute$default(this, xmlPullParser, "index", null, 4, null);
            int iIntValue = (optionalAttribute$default == null || (numT0 = x.t0(optionalAttribute$default)) == null) ? 0 : numT0.intValue();
            String optionalAttribute$default2 = getOptionalAttribute$default(this, xmlPullParser, "postScriptName", null, 4, null);
            String str2 = (optionalAttribute$default2 == null || q.K0(optionalAttribute$default2)) ? null : optionalAttribute$default2;
            String optionalAttribute$default3 = getOptionalAttribute$default(this, xmlPullParser, "fallbackFor", null, 4, null);
            String str3 = (optionalAttribute$default3 == null || q.K0(optionalAttribute$default3)) ? null : optionalAttribute$default3;
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    kotlin.jvm.internal.m.e(name, "getName(...)");
                    if (kotlin.jvm.internal.m.a(q.i1(name).toString(), "axis")) {
                        try {
                            arrayList.add(readAxis(xmlPullParser));
                        } catch (Exception e8) {
                            e8.getMessage();
                        }
                    } else {
                        skip(xmlPullParser);
                    }
                } else if (eventType == 4 && (text = xmlPullParser.getText()) != null) {
                    sb2.append(text);
                }
            }
            String string = sb2.toString();
            kotlin.jvm.internal.m.e(string, "toString(...)");
            String string2 = q.i1(string).toString();
            if (string2.length() == 0) {
                string2 = null;
            }
            if (string2 != null) {
                return new Fonts.Font(weightFromString, str, string2, !arrayList.isEmpty() ? arrayList : null, iIntValue, str2, str3);
            }
            throw new IllegalStateException("Font tag found with empty filename");
        }

        private final l readLegacyFamily(XmlPullParser xmlPullParser) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            String optionalAttribute$default = getOptionalAttribute$default(this, xmlPullParser, "variant", null, 4, null);
            String optionalAttribute$default2 = getOptionalAttribute$default(this, xmlPullParser, "lang", null, 4, null);
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    try {
                        String name = xmlPullParser.getName();
                        kotlin.jvm.internal.m.e(name, "getName(...)");
                        String string = q.i1(name).toString();
                        int iHashCode = string.hashCode();
                        if (iHashCode != -854981274) {
                            if (iHashCode != 3148879) {
                                if (iHashCode == 1721971191 && string.equals("nameset")) {
                                    arrayList.addAll(readNameset(xmlPullParser));
                                } else {
                                    skip(xmlPullParser);
                                }
                            } else if (string.equals("font")) {
                                arrayList3.add(readFont(xmlPullParser));
                            } else {
                                skip(xmlPullParser);
                            }
                        } else if (string.equals("fileset")) {
                            arrayList2.addAll(readFileset(xmlPullParser));
                        } else {
                            skip(xmlPullParser);
                        }
                    } catch (Exception e8) {
                        xmlPullParser.getName();
                        e8.getMessage();
                    }
                }
            }
            boolean zIsEmpty = arrayList3.isEmpty();
            String strRemove = BuildConfig.VERSION_NAME;
            if (!zIsEmpty) {
                if (!arrayList.isEmpty()) {
                    strRemove = arrayList.remove(0);
                }
                return fromFontList(strRemove, arrayList3, optionalAttribute$default2, optionalAttribute$default);
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            if (arrayList.isEmpty()) {
                arrayList.add(BuildConfig.VERSION_NAME);
            }
            return fromFileFonts(arrayList2, arrayList, q.i1(arrayList.remove(0)).toString(), optionalAttribute$default2, optionalAttribute$default);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006b  */
        private final List<String> readNameset(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            String string;
            xmlPullParser.require(2, null, "nameset");
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    String name = xmlPullParser.getName();
                    kotlin.jvm.internal.m.e(name, "getName(...)");
                    if (kotlin.jvm.internal.m.a(q.i1(name).toString(), "name")) {
                        int next = xmlPullParser.next();
                        String str = BuildConfig.VERSION_NAME;
                        if (next == 4) {
                            String text = xmlPullParser.getText();
                            if (text != null && (string = q.i1(text).toString()) != null) {
                                str = string;
                            }
                            xmlPullParser.next();
                        }
                        if (xmlPullParser.getEventType() == 3) {
                            String name2 = xmlPullParser.getName();
                            kotlin.jvm.internal.m.e(name2, "getName(...)");
                            if (!kotlin.jvm.internal.m.a(q.i1(name2).toString(), "name")) {
                                xmlPullParser.getEventType();
                                xmlPullParser.getName();
                            }
                        } else {
                            xmlPullParser.getEventType();
                            xmlPullParser.getName();
                        }
                        if (!q.K0(str)) {
                            arrayList.add(str);
                        }
                    } else {
                        skip(xmlPullParser);
                    }
                }
            }
            return arrayList;
        }

        private final void readNestedFamilies(XmlPullParser xmlPullParser, Map<String, Fonts.Family> map, List<Fonts.Alias> list) throws XmlPullParserException, IOException {
            xmlPullParser.require(2, null, "familyset");
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    String name = xmlPullParser.getName();
                    kotlin.jvm.internal.m.e(name, "getName(...)");
                    String string = q.i1(name).toString();
                    if (kotlin.jvm.internal.m.a(string, "family")) {
                        Fonts.Family familyEntry = readFamilyEntry(xmlPullParser, list);
                        if (familyEntry != null) {
                            String name2 = familyEntry.getName();
                            map.put((name2 == null || name2.length() == 0) ? ((Fonts.Font) m.q0(n.X(familyEntry.getFonts().values()))).getName() : familyEntry.getName(), familyEntry);
                        }
                    } else if (kotlin.jvm.internal.m.a(string, "alias")) {
                        Fonts.Alias alias = readAlias(xmlPullParser);
                        if (alias != null) {
                            list.add(alias);
                        }
                    } else {
                        skip(xmlPullParser);
                    }
                }
            }
        }

        private final List<Fonts.Family> readNestedFamiliesList(XmlPullParser xmlPullParser, List<Fonts.Alias> list) throws XmlPullParserException, IOException {
            xmlPullParser.require(2, null, "familyset");
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    String name = xmlPullParser.getName();
                    kotlin.jvm.internal.m.e(name, "getName(...)");
                    String string = q.i1(name).toString();
                    if (kotlin.jvm.internal.m.a(string, "family")) {
                        Fonts.Family familyEntry = readFamilyEntry(xmlPullParser, list);
                        if (familyEntry != null) {
                            arrayList.add(familyEntry);
                        }
                    } else if (kotlin.jvm.internal.m.a(string, "alias")) {
                        Fonts.Alias alias = readAlias(xmlPullParser);
                        if (alias != null) {
                            list.add(alias);
                        }
                    } else {
                        skip(xmlPullParser);
                    }
                }
            }
            return arrayList;
        }

        private final List<Fonts.Family> readRootElement(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z11;
            Object obj;
            Fonts.Family familyRemapAlias;
            Object obj2;
            xmlPullParser.require(2, null, null);
            String name = xmlPullParser.getName();
            if (!kotlin.jvm.internal.m.a(name, "familyset") && !kotlin.jvm.internal.m.a(name, "fonts-modification")) {
                kotlin.jvm.internal.m.a(name, "config");
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    String name2 = xmlPullParser.getName();
                    kotlin.jvm.internal.m.e(name2, "getName(...)");
                    String string = q.i1(name2).toString();
                    int iHashCode = string.hashCode();
                    if (iHashCode != -1359677826) {
                        if (iHashCode != -1281860764) {
                            if (iHashCode == 92902992 && string.equals("alias")) {
                                Fonts.Alias alias = readAlias(xmlPullParser);
                                if (alias != null) {
                                    arrayList2.add(alias);
                                }
                            } else {
                                skip(xmlPullParser);
                            }
                        } else if (string.equals("family")) {
                            Fonts.Family familyEntry = readFamilyEntry(xmlPullParser, arrayList2);
                            if (familyEntry != null) {
                                arrayList.add(familyEntry);
                            }
                        } else {
                            skip(xmlPullParser);
                        }
                    } else if (string.equals("familyset")) {
                        arrayList.addAll(readNestedFamiliesList(xmlPullParser, arrayList2));
                    } else {
                        skip(xmlPullParser);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList(n.W(arrayList, 10));
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj3 = arrayList.get(i11);
                i11++;
                arrayList3.add(((Fonts.Family) obj3).getName());
            }
            Set setE1 = m.e1(arrayList3);
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj4 = arrayList2.get(i12);
                i12++;
                Fonts.Alias alias2 = (Fonts.Alias) obj4;
                if (!setE1.contains(alias2.getName())) {
                    int size3 = arrayList.size();
                    int i13 = 0;
                    do {
                        if (i13 >= size3) {
                            obj2 = null;
                            break;
                        }
                        obj2 = arrayList.get(i13);
                        i13++;
                    } while (!kotlin.jvm.internal.m.a(((Fonts.Family) obj2).getName(), alias2.getOriginal()));
                    Fonts.Family family = (Fonts.Family) obj2;
                    if (family != null) {
                        Fonts.Family familyRemapAlias2 = SystemFontsParser.Companion.remapAlias(alias2, family);
                        if (familyRemapAlias2 != null) {
                            setE1.add(alias2.getName());
                            arrayList.add(familyRemapAlias2);
                        } else {
                            alias2.getName();
                            alias2.getOriginal();
                        }
                    }
                }
            }
            ArrayList arrayListC1 = m.c1(arrayList2);
            for (boolean z12 = true; z12 && !arrayListC1.isEmpty(); z12 = z11) {
                Iterator it = arrayListC1.iterator();
                z11 = false;
                while (it.hasNext()) {
                    Fonts.Alias alias3 = (Fonts.Alias) it.next();
                    if (setE1.contains(alias3.getName())) {
                        it.remove();
                    } else {
                        int size4 = arrayList.size();
                        int i14 = 0;
                        do {
                            if (i14 >= size4) {
                                obj = null;
                                break;
                            }
                            obj = arrayList.get(i14);
                            i14++;
                        } while (!kotlin.jvm.internal.m.a(((Fonts.Family) obj).getName(), alias3.getOriginal()));
                        Fonts.Family family2 = (Fonts.Family) obj;
                        if (family2 != null && (familyRemapAlias = SystemFontsParser.Companion.remapAlias(alias3, family2)) != null) {
                            setE1.add(alias3.getName());
                            arrayList.add(familyRemapAlias);
                            it.remove();
                            z11 = true;
                        }
                    }
                }
            }
            return arrayList;
        }

        private final Map<String, Fonts.Family> readRootElementMap(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z11;
            Fonts.Family familyRemapAlias;
            xmlPullParser.require(2, null, null);
            String name = xmlPullParser.getName();
            if (!kotlin.jvm.internal.m.a(name, "familyset") && !kotlin.jvm.internal.m.a(name, "fonts-modification")) {
                kotlin.jvm.internal.m.a(name, "config");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    String name2 = xmlPullParser.getName();
                    kotlin.jvm.internal.m.e(name2, "getName(...)");
                    String string = q.i1(name2).toString();
                    int iHashCode = string.hashCode();
                    if (iHashCode != -1359677826) {
                        if (iHashCode != -1281860764) {
                            if (iHashCode == 92902992 && string.equals("alias")) {
                                Fonts.Alias alias = readAlias(xmlPullParser);
                                if (alias != null) {
                                    arrayList.add(alias);
                                }
                            } else {
                                skip(xmlPullParser);
                            }
                        } else if (string.equals("family")) {
                            Fonts.Family familyEntry = readFamilyEntry(xmlPullParser, arrayList);
                            if (familyEntry != null) {
                                String name3 = familyEntry.getName();
                                linkedHashMap.put((name3 == null || name3.length() == 0) ? ((Fonts.Font) m.q0(n.X(familyEntry.getFonts().values()))).getName() : familyEntry.getName(), familyEntry);
                            }
                        } else {
                            skip(xmlPullParser);
                        }
                    } else if (string.equals("familyset")) {
                        readNestedFamilies(xmlPullParser, linkedHashMap, arrayList);
                    } else {
                        skip(xmlPullParser);
                    }
                }
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                Fonts.Alias alias2 = (Fonts.Alias) obj;
                if (linkedHashMap.containsKey(alias2.getName())) {
                    alias2.getName();
                } else {
                    Fonts.Family family = (Fonts.Family) linkedHashMap.get(alias2.getOriginal());
                    if (family != null) {
                        Fonts.Family familyRemapAlias2 = SystemFontsParser.Companion.remapAlias(alias2, family);
                        if (familyRemapAlias2 != null) {
                            linkedHashMap.put(alias2.getName(), familyRemapAlias2);
                        } else {
                            alias2.getName();
                            alias2.getOriginal();
                        }
                    }
                }
            }
            ArrayList arrayListC1 = m.c1(arrayList);
            for (boolean z12 = true; z12 && !arrayListC1.isEmpty(); z12 = z11) {
                Iterator it = arrayListC1.iterator();
                z11 = false;
                while (it.hasNext()) {
                    Fonts.Alias alias3 = (Fonts.Alias) it.next();
                    if (linkedHashMap.containsKey(alias3.getName())) {
                        it.remove();
                    } else {
                        Fonts.Family family2 = (Fonts.Family) linkedHashMap.get(alias3.getOriginal());
                        if (family2 != null && (familyRemapAlias = SystemFontsParser.Companion.remapAlias(alias3, family2)) != null) {
                            linkedHashMap.put(alias3.getName(), familyRemapAlias);
                            it.remove();
                            z11 = true;
                        }
                    }
                }
            }
            return linkedHashMap;
        }

        private final Fonts.Family remapAlias(Fonts.Alias alias, Fonts.Family family) {
            Fonts.Weight weight = alias.getWeight();
            if (weight == null) {
                return new Fonts.Family(alias.getName(), family.getVariant(), family.getLang(), family.getFonts());
            }
            List<Fonts.Font> list = family.getFonts().get(weight);
            if (list == null || list.isEmpty()) {
                alias.getName();
                weight.getWeight();
                alias.getOriginal();
                return null;
            }
            family.component1();
            return new Fonts.Family(alias.getName(), family.component2(), family.component3(), ry.x.X(new l(weight, list)));
        }

        private final void skip(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            int i11 = 1;
            while (i11 > 0) {
                int next = xmlPullParser.next();
                if (next == 1) {
                    return;
                }
                if (next == 2) {
                    i11++;
                } else if (next == 3) {
                    i11--;
                }
            }
        }

        public final List<String> getSYSTEM_FONTS_PATHS$kotlin_release() {
            return SystemFontsParser.SYSTEM_FONTS_PATHS;
        }

        public final List<Fonts.Family> parseFontsXML$kotlin_release(InputStream xmlFileStream) throws XmlPullParserException, IOException {
            kotlin.jvm.internal.m.f(xmlFileStream, "xmlFileStream");
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            xmlPullParserNewPullParser.setInput(xmlFileStream, null);
            xmlPullParserNewPullParser.nextTag();
            return readRootElement(xmlPullParserNewPullParser);
        }

        public final Map<String, Fonts.Family> parseFontsXMLMap$kotlin_release(InputStream xmlFileStream) throws XmlPullParserException, IOException {
            kotlin.jvm.internal.m.f(xmlFileStream, "xmlFileStream");
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            xmlPullParserNewPullParser.setInput(xmlFileStream, null);
            xmlPullParserNewPullParser.nextTag();
            return readRootElementMap(xmlPullParserNewPullParser);
        }

        private Companion() {
        }
    }

    static {
        Fonts.Weight.Companion companion = Fonts.Weight.Companion;
        fontFilesOrder = o.L(new l(companion.getNORMAL(), "normal"), new l(companion.getBOLD(), "normal"), new l(companion.getNORMAL(), Fonts.Font.STYLE_ITALIC), new l(companion.getBOLD(), Fonts.Font.STYLE_ITALIC));
    }
}
