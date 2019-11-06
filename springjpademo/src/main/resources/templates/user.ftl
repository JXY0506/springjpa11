<html>
    <head>
        <title>freemarker</title>
    </head>
<body>
    <table border="1" cellpadding="0" cellspacing="0">
        <thead>
            <tr>
                <td>id</td>
                <td>用户名</td>
                <td>密码</td>
            </tr>
        </thead>
        <tbody>
            <#list userList as user>
                <tr>
                    <td>${user.uid}</td>
                    <td>${user.username}</td>
                    <td>${user.password}</td>
                </tr>
            </#list>
        </tbody>
    </table>
</body>
</html>