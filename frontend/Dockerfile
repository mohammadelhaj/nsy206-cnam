# Use Node.js as the build environment
FROM node:12-alpine AS build

# Set the working directory inside the container
WORKDIR /app

# Copy package.json and package-lock.json to install dependencies
COPY package.json package-lock.json ./

# Install Angular CLI and project dependencies
RUN npm install -g @angular/cli@7.3.9 && npm install

# Copy the entire project into the container
COPY . .

# Build the Angular application for production
RUN ng build --prod

# Use Nginx as the runtime environment
FROM nginx:1.13.3-alpine

# Copy the built Angular app from the build stage to Nginx's web directory
COPY --from=build /app/dist/shop /usr/share/nginx/html

# Expose port 80
EXPOSE 80

# Start Nginx
CMD ["nginx", "-g", "daemon off;"]
