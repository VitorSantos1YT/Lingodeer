package cq;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[][] f22422b = {new char[]{15270, 65270, 65269}, new char[]{15271, 65272, 65271}, new char[]{1575, 65276, 65275}, new char[]{1573, 65274, 65273}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f22423c = {1536, 1537, 1538, 1539, 1542, 1543, 1544, 1545, 1546, 1547, 1549, 1550, 1552, 1553, 1554, 1555, 1556, 1557, 1558, 1559, 1560, 1561, 1562, 1563, 1566, 1567, 1569, 1595, 1596, 1597, 1598, 1599, 1600, 1611, 1612, 1613, 1614, 1615, 1616, 1617, 1618, 1619, 1620, 1621, 1622, 1623, 1624, 1625, 1626, 1627, 1628, 1629, 1630, 1632, 1642, 1643, 1644, 1647, 1648, 1650, 1748, 1749, 1750, 1751, 1752, 1753, 1754, 1755, 1756, 1759, 1760, 1761, 1762, 1763, 1764, 1765, 1766, 1767, 1768, 1769, 1770, 1771, 1772, 1773, 1774, 1775, 1750, 1751, 1752, 1753, 1754, 1755, 1756, 1757, 1758, 1759, 1776, 1789, 65136, 65137, 65138, 65139, 65140, 65141, 65142, 65143, 65144, 65145, 65146, 65147, 65148, 65149, 65150, 65151, 64606, 64607, 64608, 64609, 64610, 64611};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[][] f22424d = {new char[]{1570, 65153, 65153, 65154, 65154, 2}, new char[]{1571, 65155, 65155, 65156, 65156, 2}, new char[]{1572, 65157, 65157, 65158, 65158, 2}, new char[]{1573, 65159, 65159, 65160, 65160, 2}, new char[]{1574, 65161, 65163, 65164, 65162, 4}, new char[]{1575, 1575, 1575, 65166, 65166, 2}, new char[]{1576, 65167, 65169, 65170, 65168, 4}, new char[]{1577, 65171, 65171, 65172, 65172, 2}, new char[]{1578, 65173, 65175, 65176, 65174, 4}, new char[]{1579, 65177, 65179, 65180, 65178, 4}, new char[]{1580, 65181, 65183, 65184, 65182, 4}, new char[]{1581, 65185, 65187, 65188, 65186, 4}, new char[]{1582, 65189, 65191, 65192, 65190, 4}, new char[]{1583, 65193, 65193, 65194, 65194, 2}, new char[]{1584, 65195, 65195, 65196, 65196, 2}, new char[]{1585, 65197, 65197, 65198, 65198, 2}, new char[]{1586, 65199, 65199, 65200, 65200, 2}, new char[]{1587, 65201, 65203, 65204, 65202, 4}, new char[]{1588, 65205, 65207, 65208, 65206, 4}, new char[]{1589, 65209, 65211, 65212, 65210, 4}, new char[]{1590, 65213, 65215, 65216, 65214, 4}, new char[]{1591, 65217, 65219, 65220, 65218, 4}, new char[]{1592, 65221, 65223, 65224, 65222, 4}, new char[]{1593, 65225, 65227, 65228, 65226, 4}, new char[]{1594, 65229, 65231, 65232, 65230, 4}, new char[]{1601, 65233, 65235, 65236, 65234, 4}, new char[]{1602, 65237, 65239, 65240, 65238, 4}, new char[]{1603, 65241, 65243, 65244, 65242, 4}, new char[]{1604, 65245, 65247, 65248, 65246, 4}, new char[]{1605, 65249, 65251, 65252, 65250, 4}, new char[]{1606, 65253, 65255, 65256, 65254, 4}, new char[]{1607, 65257, 65259, 65260, 65258, 4}, new char[]{1608, 65261, 65261, 65262, 65262, 2}, new char[]{1609, 65263, 65263, 65264, 65264, 2}, new char[]{1649, 1649, 1649, 64337, 64337, 2}, new char[]{1610, 65265, 65267, 65268, 65266, 4}, new char[]{1646, 64484, 64488, 64489, 64485, 4}, new char[]{1649, 1649, 1649, 64337, 64337, 2}, new char[]{1706, 64398, 64400, 64401, 64399, 4}, new char[]{1729, 64422, 64424, 64425, 64423, 4}, new char[]{1764, 1764, 1764, 1764, 65262, 2}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22425a;

    public a(String str) {
        int i11;
        char c11;
        this.f22425a = BuildConfig.VERSION_NAME;
        int length = str.length();
        char[] cArr = new char[length];
        str.getChars(0, length, cArr, 0);
        int i12 = 0;
        char c12 = 0;
        while (i12 < length - 1) {
            if (!d(cArr[i12]) && 1604 != (c11 = cArr[i12])) {
                c12 = c11;
            }
            char c13 = cArr[i12];
            if (1604 == c13) {
                int i13 = i12 + 1;
                while (i13 < length && d(cArr[i13])) {
                    i13++;
                }
                if (i13 < length) {
                    char cB = (i12 <= 0 || a(c12) <= 2) ? b(cArr[i13], c13, true) : b(cArr[i13], c13, false);
                    if (cB != 0) {
                        cArr[i12] = cB;
                        cArr[i13] = ' ';
                    }
                }
            }
            i12++;
        }
        String strTrim = new String(cArr).replaceAll(" ", BuildConfig.VERSION_NAME).trim();
        int length2 = strTrim.length();
        int i14 = 0;
        for (int i15 = 0; i15 < length2; i15++) {
            if (d(strTrim.charAt(i15))) {
                i14++;
            }
        }
        int[] iArr = new int[i14];
        char[] cArr2 = new char[i14];
        int i16 = length2 - i14;
        int[] iArr2 = new int[i16];
        char[] cArr3 = new char[i16];
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < strTrim.length(); i19++) {
            if (d(strTrim.charAt(i19))) {
                iArr[i18] = i19;
                cArr2[i18] = strTrim.charAt(i19);
                i18++;
            } else {
                iArr2[i17] = i19;
                cArr3[i17] = strTrim.charAt(i19);
                i17++;
            }
        }
        if (i16 > 0) {
            String str2 = new String(cArr3);
            StringBuffer stringBuffer = new StringBuffer(BuildConfig.VERSION_NAME);
            int length3 = str2.length();
            char[] cArr4 = new char[length3];
            str2.getChars(0, length3, cArr4, 0);
            stringBuffer.append(c(cArr4[0], 2));
            int i21 = 1;
            while (true) {
                i11 = length3 - 1;
                if (i21 >= i11) {
                    break;
                }
                if (a(cArr4[i21 - 1]) == 2) {
                    stringBuffer.append(c(cArr4[i21], 2));
                } else {
                    stringBuffer.append(c(cArr4[i21], 3));
                }
                i21++;
            }
            if (length3 >= 2) {
                if (a(cArr4[length3 - 2]) == 2) {
                    stringBuffer.append(c(cArr4[i11], 1));
                } else {
                    stringBuffer.append(c(cArr4[i11], 4));
                }
            }
            this.f22425a = stringBuffer.toString();
        }
        String str3 = this.f22425a;
        char[] cArr5 = new char[str3.length() + i14];
        for (int i22 = 0; i22 < i16; i22++) {
            cArr5[iArr2[i22]] = str3.charAt(i22);
        }
        for (int i23 = 0; i23 < i14; i23++) {
            cArr5[iArr[i23]] = cArr2[i23];
        }
        this.f22425a = new String(cArr5);
    }

    public static int a(char c11) {
        for (int i11 = 0; i11 < 41; i11++) {
            char[] cArr = f22424d[i11];
            if (cArr[0] == c11) {
                return cArr[5];
            }
        }
        return 2;
    }

    public static char b(char c11, char c12, boolean z11) {
        char c13 = z11 ? (char) 2 : (char) 1;
        char c14 = 0;
        if (1604 == c12) {
            char[][] cArr = f22422b;
            c14 = c11 == 1570 ? cArr[0][c13] : (char) 0;
            if (c11 == 1571) {
                c14 = cArr[1][c13];
            }
            if (c11 == 1573) {
                c14 = cArr[3][c13];
            }
            if (c11 == 1575) {
                return cArr[2][c13];
            }
        }
        return c14;
    }

    public static char c(char c11, int i11) {
        for (int i12 = 0; i12 < 41; i12++) {
            char[] cArr = f22424d[i12];
            if (cArr[0] == c11) {
                return cArr[i11];
            }
        }
        return c11;
    }

    public static boolean d(char c11) {
        for (int i11 = 0; i11 < 120; i11++) {
            if (f22423c[i11] == c11) {
                return true;
            }
        }
        return false;
    }
}
