FROM node:18 AS nodejs

WORKDIR /app

#downlod all dependencies

COPY package*.json ./

RUN npm install

COPY . .

# npm create package inside build
RUN npm run build

FROM nginx:alpine

COPY --from=nodejs /app/build /usr/share/nginx/html

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
